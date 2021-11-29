import java.util.Arrays;

public class Crowd{

    Person amount[];

    public Crowd(Person amount[]){
        this.amount = amount;
    }
    public void stepBack(){
        System.out.println("Crowd steps back");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crowd crowd = (Crowd) o;
        return Arrays.equals(amount, crowd.amount);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(amount);
    }

    @Override
    public String toString() {
        return "Crowd{" +
                "amount=" + Arrays.toString(amount) +
                '}';
    }
}
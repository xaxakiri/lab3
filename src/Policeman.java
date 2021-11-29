import java.util.Objects;

public class Policeman extends Person implements IAttacker {

    Weapon weapon;

    Policeman(Weapon weapon){

        super("Полицейский");

        this.weapon = weapon;

    }

    @Override
    public void say(){
        System.out.println("Hands up!");
    }

    @Override
    public void meleeAtk() {
        System.out.println(getName() + "attacks with" + weapon.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Policeman policeman = (Policeman) o;
        return Objects.equals(weapon, policeman.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weapon);
    }

    @Override
    public String toString() {
        return "Policeman{" +
                "weapon=" + weapon +
                '}';
    }
}

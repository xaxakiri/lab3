import java.util.Objects;

public abstract class Person{

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void say() {
        System.out.println("smt to say");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

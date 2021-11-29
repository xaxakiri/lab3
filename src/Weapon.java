import java.util.Objects;

public class Weapon extends Equipment implements IDescribable {

    private final WeaponQuality type;

    Weapon(String name, Material material ,  WeaponQuality type){
        super(name,material);
        this.type = type;
    }


    @Override
    public void description() {

        System.out.println(type + getName());

    }
    enum WeaponQuality{

        NONE,
        STUNNING,
        ELECTRIC,
        BLOODLETTING

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Weapon weapon = (Weapon) o;
        return type == weapon.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type=" + type +
                '}';
    }
}



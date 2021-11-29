import java.util.Objects;

public abstract class Equipment {

    private final String name;

    private final Material material;

    Equipment(String name, Material material){
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    void equipTo(){
        System.out.println(this.name + "equipped");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Objects.equals(name, equipment.name) && material == equipment.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, material);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}


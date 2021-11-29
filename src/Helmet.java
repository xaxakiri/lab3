public class Helmet extends Equipment implements IDescribable {

    Helmet(String name, Material material){

        super(name, material);

    }

    @Override
    public void description() {
        System.out.println(getMaterial() + getName());
    }
}

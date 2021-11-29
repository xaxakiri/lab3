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
}



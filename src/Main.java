public class Main {
    public static void main(String[] args) {
        Weapon dubinka = new Weapon("shit", Material.STEEL ,  Weapon.WeaponQuality.ELECTRIC);
        Policeman p1 = new Policeman(dubinka);
    }
}

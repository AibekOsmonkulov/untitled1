public class Main {
    public static void main(String[] args) {
        Magic harryPotter = new Magic();
        harryPotter.setHealth(80);
        harryPotter.setDamage(30);

        Medic malysheva = new Medic();
        malysheva.setHealth(100);
        malysheva.setDamage(40);

        Warrior aragorn = new Warrior();
        aragorn.setHealth(120);
        aragorn.setDamage(50);
        HavingSuperAbility[] heroes = {harryPotter, malysheva, aragorn};
        for (HavingSuperAbility hero : heroes) {
            hero.applySuperAbility();
        }
    }

    public interface HavingSuperAbility {
        void applySuperAbility();

    }
}
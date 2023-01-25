public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        System.out.println("Heath "+getHealth()+", Damage "+getDamage()+", ⚕️ Medic gave everyone RED-BULL");

    }
}

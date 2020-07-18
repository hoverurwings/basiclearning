package 类作为成员变量;

public class DemoMain {
    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("极诣-驭剑士");

        Weapon weapon=new Weapon("神之意象");
        hero.setWeapon(weapon);

        hero.attack();


    }
}

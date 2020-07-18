package 类作为成员变量;

public class Hero {

    private String name;
    private Weapon weapon;

    public Hero() {
    }

    void attack(){
        System.out.println(name+"使用了"+weapon.getCode()+"对敌人发动了荣耀之剑!");
        //注意由于武器是一个类，调用时需要添加.getCode
    }

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

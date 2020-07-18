package 接口作为成员变量;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("极诣-驭剑士");

        hero.setSkill(new Skill() {
            //最简洁的写法，直接使用匿名内部类和匿名对象
            @Override
            public void use() {
                System.out.println("荣耀之剑！！！");
            }
        });

        hero.attack();
    }
}

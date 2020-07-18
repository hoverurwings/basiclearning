package 内部类相关;

/*
内部类的调用：
1.间接调用：通过外部类调用
2.直接调用：
格式：外部类名称.内部类名称 对象名称=new 外部类名称（）.new 内部类名称（）；
 */
public class DemoMain {
    public static void main(String[] args) {
        Body boy = new Body();
        boy.move();
        System.out.println("=============");

        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}

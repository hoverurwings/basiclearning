package demo05;

public class DemoMain {
    public static void main(String[] args) {
        /*
        本来里面Animal和Cat都是抽象类，new不出来
        只能创立孙子辈的LittleCat类的对象
         */
        LittleCat maomao = new LittleCat();
        maomao.sleep();
        maomao.eat();
    }
}

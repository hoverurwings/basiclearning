package demo02;

public class Impl2 implements Inrterface{
    @Override
    public void method1() {
        System.out.println("b实现了接口的抽象方法");
    }

    @Override
    public void method2() {
        System.out.println("b实现了接口的默认方法");
    }
}

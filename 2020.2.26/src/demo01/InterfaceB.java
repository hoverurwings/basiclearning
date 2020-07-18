package demo01;


public interface InterfaceB {

    abstract void methodB();

    abstract void methodAbs();

    default void method1(){
        System.out.println("重复的默认方法");
    }

}

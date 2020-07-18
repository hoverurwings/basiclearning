package demo01;

/*
1.接口里面没有静态代码块
2.实现类可以继承多个接口
3.实现类实现的多个方法之中有重复的，只需要重写一遍
4.实现类没有重写所有的抽象方法，那么自己也是抽象类
5.实现类继承的多个接口当中如果有重复的默认方法，那么必须重写此默认方法
6.如果实现类继承的父类的方法和接口里面的方法产生冲突，那么会优先使用父类的方法
 */
public interface InterfaceA {

    abstract void methodA();

    abstract void methodAbs();

    default void method1(){
        System.out.println("重复的默认方法");
    }

    default void method2(){
        System.out.println("接口方法");
    }
}

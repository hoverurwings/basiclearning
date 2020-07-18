package demo02;

//默认方法相关
public interface Inrterface {

    void method1();

    /*
    此时接口的第一个抽象方法已经投入使用于Impl1,2
    要想进行接口升级而这两个实现类继续使用不报错，需要使用默认方法default
    此时Impl1,2实现类虽然仍然只重写了第一个方法，他们也可以调用此默认方法
    甚至可以重写该方法
     */
    default void method2(){
        System.out.println("抽象类的默认方法");
    }
}

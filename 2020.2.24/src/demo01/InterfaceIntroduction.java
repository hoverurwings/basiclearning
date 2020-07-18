package demo01;

public class InterfaceIntroduction {
    /*
    接口就是多个类的公共规范
    接口是一种引用数据类型，最重要的内容就是其中的抽象方法

    接口不能直接使用，需要有一个实现类去实现
    格式：
    public class 实现类名称 implements 接口名称{
    }

    实现类必须重写接口所有的抽象方法
    创建对象进行使用

    如果实现类没有重写所有的抽象方法，那么他自己必须也是一个抽象类
     */
    public static void main(String[] args) {

        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.method1();
        impl.method3();
    }
}

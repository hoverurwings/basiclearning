package demo03;

public class DemoMain {
    public static void main(String[] args) {

        Impl a = new Impl();
        //a.method();
        //不能通过创建实现类的对象来执行接口的静态方法
        StaticInterface.method();//直接用接口名称.方法使用即可
    }
}

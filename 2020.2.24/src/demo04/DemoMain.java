package demo04;

public class DemoMain {
    public static void main(String[] args) {

        Impl a = new Impl();
        a.method1();
        a.method2();
        //a.staticMethod();如接口类里面所示，不行

        Interface.method3();
        //Interface.privateMethod();如接口类里面所示，不行
    }
}

package demo04;

//私有方法相关
public interface Interface {

    default void method1() {
        System.out.println("默认方法1");
        StaticMethid();
    }

    default void method2() {
        System.out.println("默认方法2");
        StaticMethid();

    }

    private void StaticMethid() {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");
    }

    /*如果默认方法1和2有同样的重复代码（输出aaa bbb ccc），则可以在抽象类里面再写一个方法包含他们。
    但是如果直接写成普通的default方法，就会被实现类给调用到，这是我们不想看见的
    所以介绍一个新的方法：私有方法。用private修饰
     */
    //同理可以有私有静态方法
    static void method3() {
        System.out.println("静态方法3");
        method4();
    }

    static void method4() {
        System.out.println("静态方法4");
        method4();

    }

    private static void privateMethod(){

        System.out.println("私有静态方法");
    }

}

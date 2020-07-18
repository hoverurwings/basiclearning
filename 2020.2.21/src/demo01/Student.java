package demo01;

public class Student {

    /*
    静态代码块，总是优先执行，且只执行一次
     */
    static {
        System.out.println("执行了静态代码块！");
    }

    public Student() {
        System.out.println("执行了构造方法！");
    }
}

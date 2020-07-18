package demo02;

public class ExtendField {
    public static void main(String[] args) {

        Fu fu = new Fu();
        System.out.println(fu.numFu);//注意创建父类只有父类里面的变量

        Zi zi = new Zi();
        System.out.println(zi.numZi);
        System.out.println("====================");

        /*
        此时给父类和子类都加上一个名叫num的变量
        对象是从哪一个类里面创建出来的，就优先用谁
        比如，zi从Zi里面创建出来的，就优先使用zi里面的num
         */
        System.out.println(zi.num);
        System.out.println(fu.num);
        System.out.println("====================");

        /*
        还有一种是通过成员方法访问成员变量
        很简单，调用的方法在谁那，就优先用谁
         */
        zi.methodZi();
        zi.methodFu();
    }
}

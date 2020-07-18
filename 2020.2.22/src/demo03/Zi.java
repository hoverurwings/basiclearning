package demo03;

public class Zi extends Fu {

    int num = 20;

    public void method() {
        int num = 30;//局部变量
        System.out.println("局部成员变量是：" + num);//输出的是局部变量
        System.out.println("子类成员变量是：" + this.num);//输出的是本类的成员变量
        System.out.println("父类成员变量是：" + super.num);//!!!输出的是父类的成员变量
    }
}

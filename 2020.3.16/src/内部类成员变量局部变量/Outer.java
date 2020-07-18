package 内部类成员变量局部变量;

public class Outer {

    int num = 10;

    public class Inter {
        int num = 20;
        void method(){
            int num=30;
            System.out.println("内部类局部变量"+num);//就近原则
            System.out.println("内部类成员变量"+this.num);
            System.out.println("外部类成员变量"+Outer.this.num);
        }
    }
}

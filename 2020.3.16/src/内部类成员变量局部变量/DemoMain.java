package 内部类成员变量局部变量;

public class DemoMain {
    public static void main(String[] args) {
        //别忘了直接调用内部类的格式
        Outer.Inter sth = new Outer().new Inter();
        sth.method();
    }
}

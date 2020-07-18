package demo03;

public class NewStudent {
    public static void main(String[] args) {
        Student stu1=new Student();//无参数的构造方法
        Student stu2=new Student("卢本伟",25);//有参数的构造方法

        stu2.say();

        stu1.setAge(22);
        stu1.setName("马飞飞");
        stu1.say();

    }
}

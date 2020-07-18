package demo02;

public class Student01 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setAge(18);
        stu.setName("宇智波佐助");
        stu.setMale(true);
        System.out.println(stu.getAge());
        System.out.println(stu.getName());
        System.out.println(stu.isMale());

    }
}

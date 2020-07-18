package demo06;
/*
导包：调用类时，如果和当前类在同一个包下，可以直接调用。
如果不在同一个包下，则要进行import调用
格式：import包名称.类名称
例如：import demo06.Student
 */
public class NewStu {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.age=18;
        stu.name="影流之主";
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("=========================");

        stu.manipulate();
    }
}

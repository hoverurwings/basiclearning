package demo03;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("无参数的构造方法执行！");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参数的构造方法执行");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void say(){
        System.out.println(name+"牛逼！");
    }
}

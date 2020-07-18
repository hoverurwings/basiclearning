package AboutFinal01;

public class Student2 {
    /*
    如果使用final修饰成员变量，要么直接赋值，要么通过构造器赋值，且赋值之后不能再重新赋值
     */

    private final String name;

    public Student2() {
        name="公仔aa";//通构造器赋值
    }

    public Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

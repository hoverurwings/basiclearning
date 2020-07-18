package demo01;

public class Demo01Extends {
    public static void main(String[] args) {
        Teacher one = new Teacher();
        Assistant two = new Assistant();
        one.method();
        two.method();
        /*
        在Teacher和Assistant类里面均没有写method
        仍然可以使用Employee里面的方法，即为继承
         */
    }
}

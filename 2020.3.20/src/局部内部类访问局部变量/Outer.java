package 局部内部类访问局部变量;

public class Outer {

    void outerMethod() {
        int num = 10;

        class Inner {
            void innerMethod() {
                System.out.println(num);
            /*
            局部内部类，如果要访问所在方法的局部变量，那么这个局部变量必须是不变的
            即final类型的。但java8开始，只要这个变量手动不变（如本例），那么final关键字可省略
             */

            }
        }

        Inner inner = new Inner();
        inner.innerMethod();
    }
}

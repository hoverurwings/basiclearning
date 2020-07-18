package demo03;

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(20, 20));
        System.out.println(isSame(5, 10));
        System.out.println("================");
        isSame2(10, 10);
    }

    public static boolean isSame(int a, int b) {
        boolean same = a == b;
        return same;
        /*或者更简单的写法是
        return a==b;
         */
    }

    public static void isSame2(int a, int b) {
        boolean same = a == b;
        System.out.println(same);
    }
}

package demo04;

public class MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame(10, 10));//调用比较两个Int类型的数字
        System.out.println(isSame((short) a, (short) b));
        System.out.println(isSame(10L, 15L));
    }

    public static boolean isSame(int a, int b) {
        boolean same = a == b;
        return same;
    }

    public static boolean isSame(byte a, byte b) {
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        boolean same = a == b;
        return same;
    }

    public static boolean isSame(long a, long b) {
        boolean same = a == b;
        return same;
    }
}

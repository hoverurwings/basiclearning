package demo03;

public class MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + Sum());
    }

    public static int Sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}

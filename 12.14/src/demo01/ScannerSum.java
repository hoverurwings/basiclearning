package demo01;

import java.util.Scanner;
/*
计算键盘输入数字的和
 */
public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("两个数之和为：" + result);

    }
}

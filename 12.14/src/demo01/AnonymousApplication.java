package demo01;

import java.util.Scanner;

/*
使用匿名对象来做方法的参数或者返回值
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num2 = sc.nextInt();
        System.out.println("第二个数字是"+num2);
    }

    public static void methodParam(Scanner sc) {
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("第一个数字是" + num1);
    }

    public static Scanner methodReturn() {
        System.out.println("请输入第二个数字");
        return new Scanner(System.in);
    }
}

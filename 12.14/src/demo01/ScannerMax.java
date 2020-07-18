package demo01;

import java.util.Scanner;
/*
找到键盘输入数字里面的最大值
 */
public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];
        System.out.println("请输入第一个数字：");
        array[0] = sc.nextInt();
        System.out.println("请输入第二个数字：");
        array[1] = sc.nextInt();
        System.out.println("请输入第三个数字：");
        array[2] = sc.nextInt();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("输入数据里面的最大值是：" + max);
    }
}

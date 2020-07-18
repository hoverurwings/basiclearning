package demo01;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //利用JAVA已经写好的一个类，导包，去创建一个对象
        //syetem.in是指从键盘输入数据。故还有其他的输入方式。
        Scanner sc = new Scanner(System.in);

        //获得键盘输入的一个字符串
        String word = sc.next();
        System.out.println("输入的字符串是" + word);

        //从键盘中获得的字符串里面跳出int类型的数据
        int num = sc.nextInt();
        System.out.println("键入的数据是" + num);


    }
}

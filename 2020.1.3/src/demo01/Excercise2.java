package demo01;

import java.util.Scanner;

/*
从键盘获得一个字符串，然后统计4种字符的个数
字符种类分为：大写，小写，数字，其他
 */
public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.next();

        int countUpper = 0;//大写
        int countLower = 0;//小写
        int countNumber = 0;//数字
        int countOther = 0;//其他

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if (ch >= 'A' && ch <= 'Z') {
                countUpper++;
            } else if (ch >= 'a' && ch <= 'z') {
                countLower++;
            } else if (ch >= '0' && ch <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母的个数是:" + countUpper);
        System.out.println("小写字母的个数是:" + countLower);
        System.out.println("数字的个数是:" + countNumber);
        System.out.println("其他字符的个数是:" + countOther);

    }
}

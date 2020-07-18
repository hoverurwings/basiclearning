package demo02;

import java.util.Random;
import java.util.Scanner;

public class RandomExercise {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("生成一个1-n范围的随机数，请输入n的值");
        int n = sc.nextInt();
        int num = r.nextInt(n) + 1;
        //注意审题。要生成1-n,而不是0-n。故如果写成nextInt(n+1)，则生成的是0-n
        System.out.println(num);
    }
}

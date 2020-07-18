package demo02;

import java.util.Random;

public class RandomUse {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt();      //如此写法则会生成正负20亿里面的随记一个数
        System.out.println(num1);

        for (int i = 1; i <= 10; i++) {
            int num2 = r.nextInt(11);  //如此则是规定了一个左闭右开区间，即【0，11），即0到10
            System.out.println(num2);
        }
    }
}

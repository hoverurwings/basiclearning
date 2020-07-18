package demo03;

import java.util.ArrayList;
import java.util.Random;

/*
题目；要求生成6个1-33之间的随即整数，添加到集合，并遍历集合
 */
public class ArrayExersize1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int n = r.nextInt(33) + 1;
            list.add(n);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

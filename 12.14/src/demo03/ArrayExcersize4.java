package demo03;


import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合随即存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
要求用自定义的方法进行筛选
 */
public class ArrayExcersize4 {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(r.nextInt(100) + 1);
        }

        ArrayList<Integer> expriment = getSmallList(bigList);
        for (int i = 0; i < expriment.size(); i++) {
            System.out.println(expriment.get(i));
        }
    }

    //这个方法接收大集合参数，返回小集合
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        //创建一个小集合，用来装偶数结果
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}

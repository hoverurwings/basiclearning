package demo03;

import java.util.ArrayList;

/*
本次学习ArrayList的基本操作add get remove size
 */
public class ArraylistMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("白胡子");
        list.add("香克斯");
        list.add("凯多");
        list.add("大妈");
        System.out.println(list);

        String youthest = list.get(1);
        System.out.println("最年轻的四皇是：" + youthest);

        String dead = list.remove(0);
        System.out.println("最先阵亡的四皇是:" + dead);

        int n = list.size();
        System.out.println("数组的长度为：" + n);
        
        //遍历数组 list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

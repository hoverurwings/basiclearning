package demo03;

import java.util.ArrayList;
/*
ArrayList集合只能存储引用类型
如果想存储基本数据类型，则需要“装箱”和”拆箱“
”装箱“即，把基本数据类型的关键词首字母改成大写，如long--Long
有两个特殊，int--Integer,char--Character
 */
public class ArraylistBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Long> list2 = new ArrayList<>();

        list.add(100);
        list.add(200);
        list2.add(400l);

        int a = list.get(0);
        System.out.println("数组里面第一个数字是：" + a);
    }
}

package demo03;

import java.util.ArrayList;

/*
按照自定义格式遍历集合{@@@}
其实就是写一个带参数的方法，把集合当作方法参数传进去，再在方法里面处理这个数组
 */
public class ArrayExcersize3 {
    public static void main(String[] args) {
        ArrayList<String> roger = new ArrayList<>();//shift+F6 同时修改同一个变量名

        roger.add("罗杰");
        roger.add("雷利");
        roger.add("红发");
        roger.add("巴基");

        printArray(roger);
    }

    public static void printArray(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {

            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            }
            else{
                System.out.print(list.get(i)+"@");
            }

        }
    }
}

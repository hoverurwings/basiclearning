package arraysLearning;

import java.util.Arrays;

/*
题目：把一个给定的随即字符串其中的所有字符按照倒序输出
思路：先把字符串转化为字符数组，用toCharArray，再数组字符串转化为字符，然后处理成升序排列，最后用一个forr（reverse）即可
 */
public class Arrayspratice {
    public static void main(String[] args) {
        String str = "HGHJKGJhkhjkghjgfjhFKJ";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}

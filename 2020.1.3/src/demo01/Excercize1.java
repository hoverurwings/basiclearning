package demo01;

/*
题目：把数组{1，2，...，n}转换成字符串[word1#word2...wordn]

知识点:str1+"word"是往str1字符串里面 添加而不是叠加
 */
public class Excercize1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(changeArray(array));
    }

    public static String changeArray(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}

package demo01;

/*
查找的相关内容
concat 拼接
charAt(int)
indexOf(String)
 */
public class StringGet {
    public static void main(String[] args) {
        int len = "dsgdgagagagag".length();
        System.out.println(len);//拿长度
        System.out.println("==================");

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);//拼接成新的字符串
        System.out.println("==================");

        char ch = "xixixi".charAt(0);//索引都是从0开始。包括这里找单个字符，和下面找出现的索引位置。
        System.out.println(ch);

        int num = "xixixi".indexOf("ix");
        System.out.println(num);
    }
}

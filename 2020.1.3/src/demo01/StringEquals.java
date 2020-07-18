package demo01;
/*
比较的相关内容
==是进行对象的地址值比较，如果需要比较字符串的内容的话，可以使用字符串.equals方法比较
public boolean equals(Object obj)参数可以是任何对象
1.任何对象
2.有对称性
3.推荐常量写在前面
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] array = {97, 98, 99};
        String str3 = new String(array);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println("===============");

        System.out.println(str1.equals(str3));//纯粹的内容上的比较
        System.out.println("abc".equals(str1));//常量和变量的比较，推荐把字符串写在前面
/*
        String str4 = null;
        System.out.println(str4.equals("abc"));//之所以推荐先把常量写在前面，就是为了避免出现这样的空指针异常

 */
        System.out.println("===============");

        String str5 = "ABC";
        System.out.println(str5.equals(str1));//内容比较严格区分大小写
        System.out.println(str5.equalsIgnoreCase(str1));//这样写能区别大小写
    }
}

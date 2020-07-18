package demo01;

/*
程序中直接写上双引号的字符串，就在字符串常量池中。即，若是new出来的字符串常量。不会出现在池子里（地址值也就不一样了）

对于基本类型来说，==是进行数值的比较。
对于引用类型来说，==是进行地址值的比较。
 */
public class StringPool {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";

        char[] array = {97, 98, 99};
        String str3 = new String(array);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}

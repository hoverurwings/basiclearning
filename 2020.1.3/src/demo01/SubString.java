package demo01;

/*
字符串的截取方式
substring(int index)--从参数截到末尾
substring(int begin,int end)--截取从begin开始到end结束。但此法左闭右开[)
 */
public class SubString {
    public static void main(String[] args) {
        String str1 = "OnePiece";

        int num = str1.indexOf("P");
        String str2 = str1.substring(0, num);
        System.out.println(str2);
        String str3 = str1.substring(num);
        System.out.println(str3);
    }
}

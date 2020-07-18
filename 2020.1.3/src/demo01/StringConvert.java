package demo01;

/*
转化为字符数组 toCharArray
转化为字节数组getBytes
字符串的内容替换replace
 */
public class StringConvert {
    public static void main(String[] args) {
        String str1 = "OnePiece";
        char[] chars = str1.toCharArray();
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i]);
            }
        }
        System.out.println("=============");
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " ");
        }

        String str2="你个憨批盲僧你在玩尼玛呢";
        String str3 = str2.replace("憨批", "**");
        String str4 = str3.replace("尼玛", "**");
        System.out.println(str4);

    }
}

package demo01;

//split
public class StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("==============");

        /*
        如果是要在英文句号处切割，必须使用\\.
         */
        String str2 = "aaa.bbb.ccc";
        String[] array2 = str2.split("\\.");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}

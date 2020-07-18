package arraysLearning;

import java.util.Arrays;

public class MainTwoMethod {
    public static void main(String[] args) {
        int[] array1 = {10, 2345215, 2352};

        String str1 = Arrays.toString(array1);
        System.out.println(str1);//方法一：把数组变成了字符串，并按照默认格式【，，】输出

        Arrays.sort(array1);//方法二：把数组按升序排序（无论是数字还是英文）
        System.out.println(Arrays.toString(array1));//两种方法结合

        String[] array2 = {"aa", "dd", "ee","ca"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}

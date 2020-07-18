package demo05;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arrayA = {3, 3423, 5534, 34, 345, 62};

        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
        }
        System.out.println("最大值为" + max);
    }
}

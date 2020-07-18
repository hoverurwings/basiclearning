package demo01;

public class Encapsulation {
    public static void main(String[] args) {
        int[] arrayA = {2, 3, 4, 5, 6};
        getMax(arrayA);
    }

    public static void getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值为"+max);
    }
}

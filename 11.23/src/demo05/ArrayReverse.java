package demo05;

public class ArrayReverse {
    public static void main(String[] args) {
        //只是对数组进行了反转
        int[] arrayA = {1, 2, 3, 4, 5};
        for (int min = 0, max = arrayA.length - 1; min < max; min++, max--) {
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }

        //该怎么遍历数组打印还得怎么打印
        int l = arrayA.length;
        for (int i = 0; i < l; i++) {
            System.out.println(arrayA[i]);
        }
    }
}

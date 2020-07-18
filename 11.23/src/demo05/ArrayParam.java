package demo05;

public class ArrayParam {
    public static void main(String[] args) {

        int[] arrayA = {1, 2, 2, 4, 3,};
        int[] arrayB = {2, 2, 3, 4, 5};
        printArray(arrayA);
        System.out.println("======================");
        printArray(arrayB);
        System.out.println("=-=-=-------=-==---=--");

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    /*
    此法是在主程序中写好了一个或者多个数组，再写一个方法调用这些数组。
    也可以在方法里面写数组，但这个时候方法就不能传参了，你调用这个方法也只能固定输出方法里面的数组
     */
}

package demo05;

public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int l = arrayA.length;
        System.out.println(l);
        System.out.println(arrayA.length);
        System.out.println("==========================");

        int[] arrayB = {2, 3, 35, 5, 67, 7, 1, 7, 1, 7, 3, 7, 2, 2, 7, 34, 5, 23,};
        System.out.println(arrayB.length);
        System.out.println("===========================");

        /*
        注意此时new了两次，在内存堆里面产生了两个数组，所以两次打印出来的长度是不一样的
        没有违反“数组一旦创建，在程序运行的过程中，长度不能改变”的原则
         */
        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC=new int[5];
        System.out.println(arrayC.length);
    }
}

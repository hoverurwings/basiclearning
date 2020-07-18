package demo05;

import javax.xml.transform.sax.SAXSource;

public class ArrayUse {
    public static void main(String[] args) {

        int[] arrayA = {20, 22, 24};
        System.out.println(arrayA[0]);

        int num = arrayA[2];
        System.out.println(num);
        System.out.println("========================");

        int[]arrayB=new int[3];
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);

        arrayB[2]=12315;
        System.out.println(arrayB[2]);
    }
}

package demo05;

public class Array {
    public static void main(String[] args) {
        //动态初始化数组
        int[] arrayA = new int[300];
        double[] arrayB = new double[20];

        //静态初始化
        int[] arrayC = new int[]{20, 22, 22, 33, 433};
        String[] arrayD = new String[]{"影流之主", "爱河"};

        //初始化拆分为两步
        int[]arrayE;
        arrayE=new int[2000];

        //初始化的省略格式(仅适用于静态)
        int[] arrayF={22,22,22,22};

    }
}

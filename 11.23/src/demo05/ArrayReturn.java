package demo05;

public class ArrayReturn {
    public static void main(String[] args) {
        //若试图直接获取返回值，发现获取的是一个地址
        System.out.println("总和是"+calculate(3,5,7));
        //故只能再创建一个数组， 把这个地址里面的东西拿出来
        int []result=calculate(3,5,7);
        System.out.println("总和是"+result[0]);
        System.out.println("平均值是"+result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg=sum/3;

        int[]array={sum,avg};
        return array;
    }
}

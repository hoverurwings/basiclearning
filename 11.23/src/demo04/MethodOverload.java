package demo04;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(5,6,7,8));
    }

    public static int sum(int a,int b){
        System.out.println("两个数相加");
        return a+b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("三个数相加");
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        System.out.println("四个数相加");
        return a+b+c+d;
    }
}

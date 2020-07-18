package demo02;

public class MethodParam {
    public static void main(String[] args) {
        method1(10,5);
        method2();
    }

    //有参数
    public static  void method1(int a ,int b){
        int result=a*b;
        System.out.println("结果是:"+result);
    }

    //无参数
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("影流之主-爱河");
        }
    }
}

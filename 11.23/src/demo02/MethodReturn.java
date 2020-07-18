package demo02;

public class MethodReturn {
    public static void main(String[] args) {
        int num=haveReturn(5,10);
        System.out.println(num);
        System.out.println("==================");
        noReturn(2,2);
    }

    //能进行单独、赋值、输出调用
    public static int haveReturn(int a,int b){
        int result=a*b;
        return result;
    }

    //只能进行单独调用
    public static void noReturn(int a,int b){
        int result=a+b;
        System.out.println("结果是:"+result);
    }
}

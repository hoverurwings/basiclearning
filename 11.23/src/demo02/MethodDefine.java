package demo02;

public class MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(15,25));
        System.out.println("*************************************");
        int number = sum(15,25);
        number+=100;
        System.out.println("结果等于"+number);


    }
    public static int sum(int a,int b){
        int result=a+b;
        return result;
    }
}

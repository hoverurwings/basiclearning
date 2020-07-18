package demo07;

public class PhoneParam {
    public static void main(String[] args) {
            Phone one=new Phone();
            one.price=4399;
            one.color="冰川蓝";
            one.brand="华为";

            method(one);
    }

    public static void method(Phone param){
        System.out.println("手机价格为"+param.price);
        System.out.println("手机颜色为"+param.color);
        System.out.println("手机品牌为"+param.brand);
    }
}

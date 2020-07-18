package demo07;

public class PhoneOne {
    public static void main(String[] args) {
        Phone one =new Phone();
        one.brand="华为";
        one.color="冰川银";
        one.price=4399;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("LeBron");
        one.sendMessage();
    }
}

package demo07;

public class PhoneTwo {
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

        System.out.println("=======================");

        Phone two =new Phone();
        two.brand="三星";
        two.color="白色";
        two.price=5555;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        two.call("西八人柱力");
        two.sendMessage();
    }
}

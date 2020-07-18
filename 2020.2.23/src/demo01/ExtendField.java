package demo01;

public class ExtendField {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.call();
        one.send();
        one.show();
        System.out.println("===============");

        Phone2 two =new Phone2();
        two.call();
        two.send();
        two.show();
    }
}

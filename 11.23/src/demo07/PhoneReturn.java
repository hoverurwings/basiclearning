package demo07;

public class PhoneReturn {
    public static void main(String[] args) {
        Phone two=getphone();
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println(two.brand);
    }

    public static Phone getphone() {
        Phone one = new Phone();
        one.brand="华为";
        one.color="黑色";
        one.price=4324;
        return one;
    }
    /*
    心得：
    要获得一个全新的类的对象（或者说实例）,不一定只能用new。
    可以两个对象引用同一个对象空间
    也可以创建一个返回值为自己创建类的类型的方法，再其返回值拿给新对象
     */
}

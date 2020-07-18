package demo01;

/*
匿名对象只能使用一次。可以不给这个对象起名字。
故使用建议是：如果程序中有只需要使用一次的对象，可以把他写成匿名对象。
 */
public class Anonymous {
    public static void main(String[] args) {
        new AnonymousPerson().mame="卢本伟";
    }
}

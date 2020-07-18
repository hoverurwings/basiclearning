package demo02;

/*
多态（Multi）：代码中父类引用指向子类对象

格式：
父类名称 对象名 = new 子类名称（）；
接口名称 对象名 = new 实现类名称（）；
 */
public class MultiMain {
    public static void main(String[] args) {

        Fu aa = new Zi();
        aa.mehtod();
        aa.method1();
    }
}

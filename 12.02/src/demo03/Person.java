package demo03;

public class Person {
    String name;

    public void sayHello(String name) {
        System.out.println(name + "你好，我叫" + this.name);//从哪调用的方法，this引用的就是这个类里面的参数
    }
}

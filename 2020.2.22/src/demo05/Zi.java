package demo05;

public class Zi extends Fu {

    @Override//!!此注解是系统可以自动检查你的覆盖重写有没有出错
    public String method1() {
        return null;
    }
    /*
    知识点1：如果重写的方法里面有返回值，则子类返回值范围必须小于父类
    本例里面String < Object
     */

    public void method2() {

    }
    /*
    知识点2：子类重写的方法权限比如大于父类
    public > defult(啥也不写，留空的那个) > private
     */
}

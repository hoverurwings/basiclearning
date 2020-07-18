package 匿名内部类;
/*
如果接口的实现类只需要使用唯一一次，这种情况下可以省略类的定义，使用匿名内部类

格式：
接口名称 对象名称=new 接口名称（）{
     覆盖重写的方法
}

这样就可以不用专门再去写一个实现类了
 */
public class DemoMain {
    public static void main(String[] args) {
        Interface obj=new Interface() {
            @Override
            public void method() {
                System.out.println("匿名内部类");//如此使用之后，之前的impl可以删了
            }
        };//记住不要漏分号
    }
}

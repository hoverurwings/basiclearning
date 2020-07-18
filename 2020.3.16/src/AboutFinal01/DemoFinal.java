package AboutFinal01;


/*
final修饰的类没有子类（太监类）
故其所有的方法均不能用来重写

当final修饰的是方法，则该方法不能进行覆盖重写

final修饰基本类型，不可变指的是变量中的数据不可变
final修饰引用类型，不可变说的是变量中的地址值不可变
 */
public final class DemoFinal {
    void method(){
        System.out.println("final方法");
    }
}

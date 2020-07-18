package 局部内部类;

/*
局部内部类：
即在类的一个方法里面定义的类，格式：class+方法名
注意class前面为空，且不是(default)

且不能直接在main方法里面调用局部内部类的方法，只能在外部方法里面创建方法去调用
 */
public class Outer {
    void method(){
        class Inner{
            void innerMethod(){
                System.out.println("干他妈的每日填报");
            }
        }

        Inner inner=new Inner();
        inner.innerMethod();//在外部方法里面创建方法去调用
  }
}

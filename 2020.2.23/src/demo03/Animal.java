package demo03;
/*
抽象方法：加上abstract关键词，去掉大括号，直接分号结束
抽象类：使用抽象方法，必须是抽象类，在public后面加上abstract。且这个抽象类不能直接new对象
       必须使用子类继承，然后覆盖重写其实现方法，创建对象后使用
 */
public abstract class Animal {

    public abstract void eat();//抽象方法，代表吃，但怎么吃不知道

    public void normalMethod(){

    }//普通的成员方法
}

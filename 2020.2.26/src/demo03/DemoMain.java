package demo03;

public class DemoMain {
    public static void main(String[] args) {

        Fu aa = new Zi();
        System.out.println(aa.num);//等号左边是谁输出谁的num
        //System.out.println(aa.age); 错误写法，根本Fu类里面根本没有age

        aa.show();//访问成员方法则是，看方法属于谁优先访问谁,与上面直接访问成员变量不同
    }
}

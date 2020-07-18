package demo01;

public class Phone2 extends Phone{
    @Override
    public void show() {
        super.show();//很神奇的是，这一版本的IDEA重写的时候会自动帮你补齐
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}

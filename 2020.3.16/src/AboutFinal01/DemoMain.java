package AboutFinal01;

public class DemoMain {
    public static void main(String[] args) {
        final int num;
        num = 23;

        final Student stu=new Student("尹智昊");
        System.out.println(stu.getName());
        //stu=new Student("剑宗");错误，地址值不能改变
        System.out.println("=======================");
        stu.setName("剑宗 尹智昊");
        System.out.println(stu.getName());//在不改变地址值的情况下，你想改它的"名字"随便改

    }
}

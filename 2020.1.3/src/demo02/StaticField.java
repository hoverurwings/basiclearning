package demo02;

/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享一份数据
如本例Student类里面的idCounter是每一个对象创建了之后都会有的
设置了一个++idCounter，使其严格按对象的创建顺序逐个+1。
例如本例，把sasuke放在naruto之前创立，则sasuke的id则为1
 */
public class StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("Naruto", 22);
        stu1.room = "第七班";
        System.out.println("姓名：" + stu1.getName()
                + ",年龄：" + stu1.getAge()
                + ",教室：" + stu1.room
                + ",学号：" + stu1.getId());

        Student stu2 = new Student("Sasuke", 23);
        System.out.println("姓名：" + stu2.getName()
                + ",年龄：" + stu2.getAge()
                + ",教室：" + stu2.room
                + ",学号: " + stu2.getId());

        Student stu3 = new Student("Sakula", 21);
        System.out.println("姓名: " + stu3.getName()
                + ",年龄：" + stu3.getAge()
                + ",教室：" + stu3.room
                + ",学号: " + stu3.getId());

    }
}

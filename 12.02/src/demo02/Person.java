package demo02;

public class Person {
    String name;
    private int age;

    public void setAge(int num) {
        if (num > 0 && num < 100) {
            this.age = num;
        } else {
            System.out.println("数据不合理");
        }
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("我叫" + name + ",我今年" + age + "岁");
    }
}

package demo02;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("吃鱼鱼");
    }

    void catchFish() {
        System.out.println("猫抓鱼");
    }
}

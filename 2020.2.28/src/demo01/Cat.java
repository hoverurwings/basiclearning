package demo01;

public class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    void catchFish(){
        System.out.println("抓鱼");
    }
}

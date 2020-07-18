package demo05;

public abstract class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫在睡觉");
    }

    //注意，此时Cat类只重写了了eat，没有重写sleep，sleep仍为抽象方法，故Cat类仍然为抽象类，需要加abstract
}

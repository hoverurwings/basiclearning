package demo02;

/*
如果要用到向下转型，想知道它原先创建的时候是在什么类里面创建的
用intanceof关键字,得到一个布尔值
 */
public class DemoMain {
    public static void main(String[] args) {
        Animal animal = new Dog();
        giveMeAnPet(animal);
    }

    public static void giveMeAnPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.stay();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchFish();
        }
    }
}

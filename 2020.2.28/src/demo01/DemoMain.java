package demo01;


/*
1.向上转型（其实就是多态）
  父类名称 对象名 = new 子类名称（）；
2.向下转型（还原，需要你原来什么类就是什么类）
  子类名称 对象名 = （子类名称）父类对象
 */
public class DemoMain {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        //animal.catchFish(); 错误
        //理解：吃是动物都有的，创建了一只猫，把它当成动物看待，没问题。可以调用动物的吃的方法，重写之后变成吃鱼
        //但是你被当成动物看待，就不一定会抓鱼了

        Cat cat = (Cat) animal;
        cat.catchFish();
        //现在把这个动物当作猫看待，就有了抓鱼的方法
        //向下转型是一个还原过程，必须创建的时候它本来就是猫
    }
}


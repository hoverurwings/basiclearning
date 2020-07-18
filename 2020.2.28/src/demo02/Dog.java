package demo02;

public class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("吃骨头");
    }

    void stay(){
        System.out.println("看家");
    }
}

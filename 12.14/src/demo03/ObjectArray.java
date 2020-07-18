package demo03;

public class ObjectArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person a=new Person("凯多",45);
        Person b=new Person("大妈",65);
        Person c=new Person("黑胡子",33);

        array[0]=a;
        array[1]=b;
        array[2]=c;

        System.out.println(array[0].name);
        System.out.println(array[1].name);
        System.out.println(array[2].name);
    }
}

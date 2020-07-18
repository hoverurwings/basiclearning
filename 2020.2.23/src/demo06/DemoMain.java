package demo06;

import java.util.ArrayList;

public class DemoMain {
    public static void main(String[] args) {

        Manager manager=new Manager("群主",100);

        Member one =new Member("潜水1",0);
        Member two =new Member("潜水2",20);
        Member three =new Member("潜水3",5);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============");

        ArrayList<Integer> redpacket=manager.send(20,3);
        one.receive(redpacket);
        two.receive(redpacket);
        three.receive(redpacket);
        System.out.println("===============");

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==============");

    }
}

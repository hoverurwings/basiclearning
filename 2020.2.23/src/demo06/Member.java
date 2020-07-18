package demo06;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    //从集合（红包）里面找一个抢
    public void receive(ArrayList<Integer> list) {
        int n = new Random().nextInt(list.size());//把之前的两步法简写成一行
        int receiveMoney=list.remove(n);
        int money=super.getMoney();
        super.setMoney(money+receiveMoney);
    }
}

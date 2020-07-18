package demo06;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> redpacket = new ArrayList<>();//创建集合存储红包金额

        //判断群主余额是否够发红包
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney) {
            System.out.println("余额不足");
            return redpacket;//返回空集合，完善方法
        }

        //够钱发红包的话
        super.setMoney(leftMoney - totalMoney);

        //发红包分成count份（方法参数定义）
        int avg = totalMoney / count;
        int mod = totalMoney % count;//剩的零头

        //把金额放入集合中
        for (int i = 0; i < count - 1; i++) {
            redpacket.add(avg);
        }
        int last = avg + mod;
        redpacket.add(last);//把剩下的红包放进最后一个红包（大红包）

        return redpacket;
    }
}

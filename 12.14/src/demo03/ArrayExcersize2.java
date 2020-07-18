package demo03;

import java.util.ArrayList;

/*
自定义三大将，添加到集合，并且进行遍历
 */
public class ArrayExcersize2 {
    public static void main(String[] args) {
        ArrayList<OnePiece> list = new ArrayList<>();

        OnePiece a = new OnePiece("萨卡斯基", "赤犬");
        OnePiece b = new OnePiece("库赞", "青雉");
        OnePiece c = new OnePiece("伯鲁萨莉诺", "黄猿");

        list.add(a);
        list.add(b);
        list.add(c);

        for (int i = 0; i < list.size(); i++) {
            OnePiece op = list.get(i);
            System.out.println("姓名是："+op.getName()+"绰号是:"+op.getNickname());
        }
    }
}

package demo02;

public class ExcersizeOnePiece {
    public static void main(String[] args) {
        OnePiece one = new OnePiece(55, "白胡子");
        System.out.println(one.level + "，名字是：" + one.getName() + ",年龄：" + one.getAge() + ",赏金排行是：" + one.getId());

        OnePiece two = new OnePiece(46, "凯多");
        System.out.println(two.level + "，名字是：" + two.getName() + ",年龄：" + two.getAge() + ",赏金排行是：" + two.getId());

        OnePiece three = new OnePiece(65, "大妈");
        System.out.println(three.level + "，名字是：" + three.getName() + ",年龄：" + three.getAge() + ",赏金排行是：" + three.getId());

        OnePiece four = new OnePiece(40, "红发");
        System.out.println(four.level + "，名字是：" + four.getName() + ",年龄：" + four.getAge() + ",赏金排行是：" + four.getId());

        OnePiece five = new OnePiece(22, "路飞");
        System.out.println("接不住雷鸣八卦的新的五皇，名字是：" + five.getName() + ",年龄：" + five.getAge() + ",赏金排行是：" + five.getId());

    }
}

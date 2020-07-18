package mathLeaning;


//注意：向上向下取整带小数点，四舍五入不带小数点

//查看API文档 ctrl+点击math，再ctrl+F2

public class MathMathods {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(-3423));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(3235223));
        System.out.println("=================");

        //向上取整
        System.out.println(Math.ceil(-3423.9));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.ceil(4.1));
        System.out.println("=================");


        //向下取整
        System.out.println(Math.floor(4.1));
        System.out.println(Math.floor(4.6));
        System.out.println(Math.floor(2.9));
        System.out.println("=================");

        //四舍五入
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(4.4));

        //圆周率
        System.out.println(Math.PI);
        System.out.println("=================");

    }
}

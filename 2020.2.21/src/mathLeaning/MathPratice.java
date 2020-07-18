package mathLeaning;

/*计算在-10.8到5.9之间,绝对值大于6或者小于2.1的整数个数
思路：找整数个数，故写for循环定义一个int i给min,或者使用取上整ceil
 */

public class MathPratice {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1)
                //要求的是个数，不用输出
                count++;
        }
        System.out.println("个数是：" + count);
    }
}

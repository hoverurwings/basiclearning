package demo01;

public class DemoMain {
    public static void main(String[] args) {

        Labtop MagicBookPro = new Labtop();
        MagicBookPro.powerOn();

        USB keyBoardUSB = new KeyBoard();//向上转型成USB类，以便符合带参数方法的调用
        MagicBookPro.useDevice(keyBoardUSB);

        Mouse mouse = new Mouse();//也可以直接new一个mouse，同样当成USB看待
        MagicBookPro.useDevice(mouse);

        MagicBookPro.powerOff();

    }
}

package demo01;

public class Labtop {
    void powerOn() {
        System.out.println("开机");
    }

    void powerOff() {
        System.out.println("关机");
    }

    void useDevice(USB usb) {
        usb.open();
        //针对不同的设备，调用其不同的特有的方法
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.input();
        }
        usb.close();

    }
}

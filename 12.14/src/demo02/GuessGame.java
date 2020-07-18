package demo02;

import javafx.scene.control.RadioMenuItem;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int randomNumber = r.nextInt(99) + 1;


        while (true){
            System.out.println("请输入你猜的数字");
            int guessNumber = sc.nextInt();

            if(guessNumber>randomNumber){
                System.out.println("太大了，请重试");
            }
            else if(guessNumber<randomNumber){
                System.out.println("太小了，请重试");
            }
            else {
                System.out.println("猜对了，NB");
                break;
            }
        }
    }
}

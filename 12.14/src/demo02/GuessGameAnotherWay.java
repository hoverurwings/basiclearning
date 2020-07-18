package demo02;

import java.util.Random;
import java.util.Scanner;

public class GuessGameAnotherWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int randomNumber = r.nextInt(99) + 1;//猜1-99的数


        for (int i = 1; i <=3 ; i++) {
            System.out.println("请输入你猜的数字,一共三次机会");
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

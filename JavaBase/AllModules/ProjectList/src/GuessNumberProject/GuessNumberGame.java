package GuessNumberProject;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static int getScore(){
        int score =0;
        Random ran =new Random();
        int ran1 = ran.nextInt(100);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数字:");
            int numb1 = sc.nextInt();
            if(numb1>ran1){
                System.out.println("猜大了!");
                System.out.println("-------------------------------------");
                score -= 1;
            }else if(numb1<ran1){
                System.out.println("猜小了!");
                System.out.println("-------------------------------------");
                score -= 1;
            }else{
                System.out.println("恭喜猜对了!");
                score += 10;
                break;
            }
        }
        return score;
    }
}

package JavaBase.day4_1;

import java.util.Random;
import java.util.Scanner;

public class ClassPracticeDemo1 {
    //求 1 -100以内所有的能被7整除和包含7的整数
    /*public static void main(String[] args) {
        for(int i= 1;i<=100;i++){
            if(i%7 == 0){
                System.out.print(i+" ");
            }else if(i%10 == 7){
                System.out.print(i+" ");
            }else if(i/10 ==7){
                System.out.print(i+" ");
            }
        }
    }*/

    /*
    * 打印:
    * *****
    * ****
    * ***
    * **
    * *
    * */
    /*public static void main(String[] args) {
        for(int i =0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    /*1.有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
    假如兔子都不死，问每个月的兔子对数为多少？
*/
    /*public static void main(String[] args) {
        System.out.println("请输入月数:");
        Scanner sc = new Scanner(System.in);
        int mon =sc.nextInt();
        int numb1 =1;
        int numb2 =1;
        if(mon/3 == 0){
            numb2 =numb1;
        }else{
            for(int i =0;i<(mon/3);i++){
                int temp = numb2;
                numb2 =numb2+numb1;
                numb1 = temp;
            }
        }
        System.out.println(mon+"月后兔子的对数为:"+numb2+"对");
    }*/

    /*
    * 1.使用switch对我们的猜数字游戏设计几个功能选项
      2. 1.登录   username  password
         2.玩游戏    如果没有登录  就不让玩  就让他去登录
                            只有登录过后 才让玩

                            记录分数   10分  猜错一次  扣一分
                            告诉他得了多少分  总分是多少
    * */

    /*public static void main(String[] args) {
        Random ran =new Random();
        int ran1 = ran.nextInt(100)+1;
        int count = 1;
        while (true) {
            System.out.println("请输入一个数字(1-100):");
            Scanner sc = new Scanner(System.in);
            int numb1 = sc.nextInt();
            if(numb1 >ran1){
                System.out.println("sorry,输入的数字大了");
                System.out.println("--------------------");
            }else if(numb1<ran1){
                System.out.println("sorry,输入的数字小了");
                System.out.println("--------------------");
            }else {
                System.out.println("恭喜,猜对了!");
                break;
            }
            count++;
        }
        System.out.println("猜的次数为:"+count);
    }*/

    public static void main(String[] args) {
        String userName = "Cypress";
        String password = "asd123";
        System.out.println("********欢迎来到猜数字游戏登录页面********");
        while (true) {
            System.out.println("请输入用户名:");
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            System.out.println("请输入密码:");
            String str2 = sc.nextLine();
            if(!userName.equals(str1) || !password.equals(str2)){
                    System.out.println("用户名或密码错误!");
                System.out.println("*******************");
            }
            else{
                System.out.println("登录成功,猜数字游戏即将开始!");
                //猜数字游戏
                getScore();
                break;
            }
        }
    }

    public static void getScore(){
        int score = 0;
        Random ran =new Random();
        int ran1 = ran.nextInt(100)+1;
        while (true) {
            System.out.println("请输入一个数字(1-100):");
            Scanner sc = new Scanner(System.in);
            int numb1 = sc.nextInt();
            if(numb1 >ran1){
                System.out.println("sorry,输入的数字大了");
                score -=1;
                System.out.println("--------------------");
            }else if(numb1<ran1){
                System.out.println("sorry,输入的数字小了");
                score -=1;
                System.out.println("--------------------");
            }else {
                System.out.println("恭喜,猜对了!");
                score +=10;
                System.out.println("是否继续游戏?(y/n)?");
                String choice = sc.next();
                if(!"y".equals(choice)){
                    System.out.println("游戏结束,您的最终得分为:"+score);
                    break;
                }else{
                    ran1 = ran.nextInt(100)+1;
                }
            }
        }

    }
}

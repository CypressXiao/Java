package JavaBase.day4_1;

import java.util.Scanner;

public class Day4_1Test1 {
    public static void main(String[] args) {
        /*//打印1-20所有的数字
        for(int i=1;i<=20;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //打印1-100中所有的数字
        for(int j =2;j<=100;j+=2){
            System.out.print(j+" ");
        }
        System.out.println();

        //打印1-100的和
        int sum =0;
        for(int k =1;k<=100;k++){
            sum +=k;
        }
        System.out.println("1-100的和为:"+sum);*/
        /*int money = 0;
        int day = 0;
        while(money < 100){
            money += 3;
            if(day%3 == 0) {
                money =money-5;
            }
            day++;
        }
        System.out.println(day);*/
       /* int times = 0;
        double height =0.5;
        while(height<8848){
            height *=2;
            times++;
        }
        System.out.println(times);*/
        /*int before_one = 1;
        int before_two = 1;
        int month = 3;
        while (month <= 12) {
            int temp = before_two;
            before_two = before_one + before_two;
            before_one = temp;
            month++;
        }
        System.out.println(before_two);*/

        /*有一只猴子第一天摘了一堆桃子,吃掉了桃子的一半零一个;第二天吃第一天剩下的桃子的一半零一个;以后的每天都是如此 ;
        到了第十天时,桃子只剩下了一个;问第一天桃子摘了多少个*/

        /*int total = 1;
        int i = 1;
        while(i<10){
            total = (total+1)*2;
                    i++;
        }
        System.out.println(total);*/

        String password = "1234qwer";
        boolean flag = true;
        while(flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码:");
            String p =sc.nextLine();
            if(password.equals(p)){
                System.out.println("登录成功!");
                flag = false;
            }
        }
    }
}

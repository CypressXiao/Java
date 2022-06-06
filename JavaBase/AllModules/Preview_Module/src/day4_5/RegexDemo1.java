package day4_5;

import java.util.Scanner;

//输入一个QQ号,要求必须是一个5-15位的数字,并且不能以0开头
public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入一个号码:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /*if (str.charAt(0) != '0' && str.trim().length() >= 5 && str.trim().length() <= 15) {
            for(int i= 0;i<str.length();i++){
                if(!Character.isDigit(str.charAt(i))){
                    System.out.println("该号码不为QQ号码!");
                    return;
                }
            }
        System.out.println("该号码为QQ号码!");
        }*/
        String regex ="[0-9]\\d{4,14}";
        System.out.println(str.matches(regex));
    }
}

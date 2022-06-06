package day4_5;

import java.util.Scanner;

public class LoginDemo1 {
    public static void main(String[] args) {
        String userName = "admin";
        String password = "qwer1234";
        Scanner sc = new Scanner(System.in);
        int i =0;
        while(i<3){
            System.out.println("请输入用户名:");
            String str = sc.nextLine();
            System.out.println("请输入密码:");
            String str2 =sc.nextLine();
            if(!"admin".equals(str) || !"qwer1234".equals(str2)){
                System.out.println("登录失败,剩余登录次数为"+(2-i)+"次");
                i++;
            }else{
                System.out.println("登陆成功!");
                break;
            }
        }
    }
}

package day3_25;

import java.util.Random;
import java.util.Scanner;

public class LoginCode {
    public static void main(String[] args) {
        System.out.println("欢迎来到京东登录页面！");
        System.out.println("请选择登录方式：");
        System.out.println("1、用户名及密码登录");
        System.out.println("2、手机及验证码登录");
        Scanner sc = new Scanner(System.in);
        String loginChoice = sc.nextLine();
        System.out.println("--------------------");
        String[] userNames = new String[10000];
        String[] passwords = new String[10000];
        boolean flag = true;
        if ("1".equals(loginChoice)) {
            int count = 0;
            while (flag) {
                System.out.println("请输入用户名：");
                String userName = sc.next();
                System.out.println("请输入密码：");
                String password = sc.next();
                for (String name : userNames) {
                    if (userName.equals(name)) {
                        for (String s : passwords) {
                            if (password.equals(s)) {
                                System.out.println("--------------------");
                                System.out.println("*****欢迎来到京东*****");
                                flag = false;
                                break;
                            }
                        }
                    } else {
                        System.out.println("--------------------");
                        System.out.println("该用户未注册,是否注册?(y/n)");
                        String enrollChoice = sc.next();
                        if ("y".equals(enrollChoice)) {
                            boolean flag2 = true;
                            while (flag2) {
                                System.out.println("请输入注册用户名:");
                                String newUserName = sc.next();
                                System.out.println("请输入注册密码:");
                                String newPassword = sc.next();
                                for (String name1 : userNames) {
                                    if (newUserName.equals(name1)) {
                                        System.out.println("该用户已被注册!");
                                        break;
                                    } else {
                                        userNames[count] = newUserName;
                                        passwords[count] = newPassword;
                                        count += 1;
                                        flag2 = false;
                                    }
                                }
                            }
                                System.out.println("---------------------");
                            }else{
                                System.out.println("欢迎下次登录!");
                                flag = false;
                            }

                    }
                    break;
                }
            }
        }else if("2".equals(loginChoice)){
            String str ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
            Random ran =new Random();
            StringBuilder code = new StringBuilder("");
            for(int i =1;i<5;i++){
                int numb = ran.nextInt(str.length()-1);
                char ranNumb =str.charAt(numb);
                code.append(ranNumb);
            }
            System.out.println("请输入手机号码:");
            String phone =sc.next();
            System.out.println("此次登录的验证码为:");
            System.out.println(code);
            System.out.println("请输入验证码:");
            String code1 = sc.next();
            System.out.println("*****欢迎来到京东*****");

        }
    }
}

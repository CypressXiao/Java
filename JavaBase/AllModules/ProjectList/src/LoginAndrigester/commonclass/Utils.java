package LoginAndrigester.commonclass;

import java.util.Scanner;

/**
 * @ClassName Utils
 * @Description 多用户登录所用到对的所有工具类
 * @Author 肖榆柏
 * @Date 2022/5/3 8:19
 * @Version 1.0
 */

public class Utils {
    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int getInput1(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static Student stuInfo(){
        System.out.println("学号:");
        int num = Utils.getInput1();
        System.out.println("姓名:");
        String str3 = Utils.getInput();
        System.out.println("年龄:");
        int num1 = Utils.getInput1();
        System.out.println("性别:");
        String str5 = Utils.getInput();
        System.out.println("所属老师:");
        String str6 = Utils.getInput();
        final Student stu = new Student(num, str3, num1, str5, str6);
        return stu;
    }
}
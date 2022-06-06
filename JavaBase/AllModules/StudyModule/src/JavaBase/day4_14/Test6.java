package JavaBase.day4_14;

import java.util.Scanner;

/**
 * 附加题:
 *         完成一个游戏系统的登录和注册方法
 *             1.注册:
 *                 1.验证账号是否符合注册要求(长度为6-15位,首字母必须为大写字母开头)
 *                 2.验证账号是否存在
 *                 3.将用户保存在集合中
 *                 4.如果账号已存在,那就继续注册,最多不能超过3次,并且提示用户
 *
 *             2.登录:
 *                 1.验证账号和密码是否正确
 *                 2.如果不正确,就重新输入,不能超过3次
 *                 3.如果正确,就登录成功
 *
 *             3.注销用户:
 *                 将用户从集合中进行删除
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println("********欢迎来到王者荣耀登录系统********");
        System.out.println("请输入你的选择:");
        System.out.println("1.登录");
        System.out.println("2.注册");
        System.out.println("3.注销");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch(str){
            case "1":
                Choice.login();
                break;
            case "2":
                Choice.register();
                break;
            case "3":
                Choice.del();
                break;
            default:
                System.out.println("输入错误!");
                break;
        }
    }
}

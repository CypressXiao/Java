package GuessNumberProject;

import java.util.Scanner;

/**
* 猜数字游戏:
* 1.登录: 判断用户名和密码是否输入正确,如果正确,登录成功,如果错误,登录失败
*   开始游戏
*   修改密码
*   查看分数
* 2.注册: 判断用户名是否存在,如果用户名存在,就提示账号已经被占用,重新注册,用户名不存在,再输入密码,然后保存免密
* 3.注销:
*   需要一个用户类
*   需要一个保存用户对象的集合  ArrayList<User>()
*/

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("**********欢迎来到猜数字游戏登录页面*********");
        System.out.println("请输入你的操作选项:1.登录 2.注册 3.注销");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice){
            case "1":
                new UserAction().login();
                break;
            case "2":
                new UserAction().register();
                break;
            case "3":
                new UserAction().delete();
                break;
            default:
                System.out.println("输入错误!");
        }

    }
}

package LogAndRegisterProject;

import java.util.Scanner;

public class HomePageThread implements Runnable {

    @Override
    public void run() {
        synchronized (HomePage.class) {
            Scanner sc = new Scanner(System.in);

            //设计主页面包含登录和注册两个选项,可无限循环直到退出
            boolean flag = true;
            do {
                System.out.println("*******欢迎来到信护主页面********");
                System.out.println("请输入你的选项:");
                System.out.println("1.登录");
                System.out.println("2.注册");
                System.out.println("3.退出主页面");
                String choice = sc.next();
                switch (choice) {
                    case "1":
                        new FunctionImplement().login(sc);
                        break;
                    case "2":
                        new FunctionImplement().register(sc);
                        break;
                    case "3":
                        flag = false;
                        break;
                    default:
                        System.out.println("输入不合法,请重新输入!");
                }
            } while (flag);
        }
    }
}

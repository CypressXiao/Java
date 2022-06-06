package LogAndRegisterProject;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *  1.登录和注册界面
 *  2.如果登录就输入账号和密码,正则限定格式,判断账号和密码的输入的正确性
 *
 *      (就是从序列化文件中拿出数据,然后对比)
 *      如果有错误,就提示账号和密码有误,请重新输入
 *
 *      如果没错,就登陆成功
 *          跳转到游戏界面
 *              选择玩游戏
 *              查看成绩
 *              查看排名
 *
 *  3.注册
 *      输入账号和密码
 *      然后从序列化文件中拿出用户和输入的账号密码比对,
 *      如果存在,就重新输入账号
 *      如果不存在,就将序列化文件中的集合,反序列化出来,然后添加一个新的用户,然后重新序列化集合
 *
 */

public class HomePage {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,6,60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(6),new ThreadPoolExecutor.AbortPolicy());
        pool.submit(new LogAndRegisterProject.HomePageThread());
        pool.submit(new LogAndRegisterProject.HomePageThread());
        pool.submit(new LogAndRegisterProject.HomePageThread());

        //设计主页面包含登录和注册两个选项,可无限循环直到退出
        /*Scanner sc = new Scanner(System.in);

        boolean flag = true;
        do{
            System.out.println("*******欢迎来到信护主页面********");
            System.out.println("请输入你的选项:");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出主页面");
            String choice = sc.next();
            switch(choice){
                case "1":
                    new FunctionImplement().login(sc);
                    break;
                case "2":
                    new FunctionImplement().register(sc);
                    break;
                case "3":
                    flag =false;
                    break;
                default:
                    System.out.println("输入不合法,请重新输入!");
            }
        }while(flag);*/
    }
}

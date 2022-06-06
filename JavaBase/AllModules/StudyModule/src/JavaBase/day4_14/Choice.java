package JavaBase.day4_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Choice {
    /**
     * 1.注册:
     *                  1.验证账号是否符合注册要求(长度为6-15位,首字母必须为大写字母开头)
     *                  2.验证账号是否存在
     *                  3.将用户保存在集合中
     *                  4.如果账号已存在,那就继续注册,最多不能超过3次,并且提示用户
     */
    static Map<String,String> map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void register(){
        System.out.println("欢迎进入注册页面!");
        Set<String> set = map.keySet();
        int count = 1;
        while (count<=3) {
            System.out.println("请输入要注册的账号:");
            String username = sc.next();
            if (username.length()>=6 && username.length() <= 15 && (username.charAt(0)>='A'&&username.charAt(0)<='Z')) {
                if(set.contains(username)){
                    System.out.println("该用户已被注册!");
                    System.out.println("剩余"+(3-count)+"次机会");
                    count++;
                }else{
                    System.out.println("请输入密码:");
                    String password = sc.next();
                    map.put(username,password);
                    System.out.println("注册成功,请登录!");
                    System.out.println(map);
                    login();
                    break;
                }
            }
            else{
                System.out.println("输入账号不合法!");
                System.out.println("---------------------------------------------------------------");
            }
        }
    }

    /**
     *  2.登录:
     *                 1.验证账号和密码是否正确
     *                 2.如果不正确,就重新输入,不能超过3次
     *                 3.如果正确,就登录成功
     */
    public static void login(){
        System.out.println("欢迎进入登录页面!");
        System.out.println("请输入用户名:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();
        if(map.size() == 0){
            System.out.println("请先进行注册!");
            register();
            login();
        }else if(map.containsKey(username) && map.containsValue(password)){
            System.out.println("登录成功!");
        }else{
            System.out.println("登录失败!");
        }
    }
    /**
     * 3.注销用户:
     *              将用户从集合中进行删除
     */
    public static void del(){
        System.out.println("请输入要删除的用户名:");
        String username = sc.next();
        if(map.containsKey(username)){
            map.remove(username);
            System.out.println(map);
        }else{
            System.out.println("该用户不存在");
        }
    }
}


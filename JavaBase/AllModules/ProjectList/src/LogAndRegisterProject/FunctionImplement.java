package LogAndRegisterProject;

import java.util.HashMap;
import java.util.Scanner;

public class FunctionImplement implements UserChoice {
    //获取储存着已有注册信息的map集合,使用反序列化操作
    static HashMap<String, User> map = SerializableOperation.deserialize();
    static int count = 3;

    @Override
    public void login(Scanner sc) {
        System.out.println("是否注册?(y/n)");
        String ans = sc.next();
        if(ans.toLowerCase().equals("n")){
            register(sc);
            System.out.println("即将跳转至登录页面...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //输入用户名及密码
        while (true) {
            if (count == 0) {
                System.out.println("今日登录次数已用完,请明日登录!");
                break;
            }
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            if (map.containsKey(username) && map.get(username).getPassword().equals(password)) {
                System.out.println("登录成功!");
                break;
            } else {
                System.out.println("登录失败!还剩" + (--count) + "次机会");
            }
        }
    }

    @Override
    public void register(Scanner sc) {
        while (true) {
            //输入用户名
            System.out.println("**用户名必须以字母开头,其余位由数字,字母和下划线组成,长度在5-15位**");
            System.out.println("请输入注册用户名:");
            String username = sc.next();
            //用正则进行匹配,不满足跳过本次操作继续输入注册名字
            if (!username.matches("^[a-zA-Z]\\w{4,14}$")) {
                System.out.println("用户名不合法");
                continue;
            }
            //匹配成功,输入注册的密码
            System.out.println("**必须以数字开头,其余位由数字,字母和下划线组成,共6-10位**");
            System.out.println("请输入密码:");
            String password = sc.next();
            if (!password.matches("^\\d\\w{5,9}$")) {
                System.out.println("密码不合法");
                continue;
            }
            //注册成功后创建新的User对象并存入map中
            User user = new User(username, password, 0);
            if (map.containsKey(user.getUserName())) {
                System.out.println("该用户已被注册,请重新注册!");
                continue;
            } else {
                map.put(user.getUserName(), user);
            }
            //序列化包含用户注册信息的map
            SerializableOperation.serialize(map);
            System.out.println("注册成功!");
            break;
        }
    }
}

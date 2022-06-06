package GuessNumberProject;

import java.util.ArrayList;
import java.util.Scanner;

//对用户的不同行为进行具体描述
class UserAction extends UserChoice {
    //创建一个集合用于接收用户的信息
    static ArrayList<User> list = new ArrayList<>();
    //创建一个集合用于收集用户名的list
    static ArrayList<String> list1 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //用户登录操作
    public void login() {
        UserAction login = new UserAction();
        int count = 0;
        A:while (count < 3) {
            //输入用户名及密码
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            //将用户名及密码存入list中,score默认为0;
            User user = new User(username, password, 0);
            if (list.size() == 0) {
                System.out.println("该用户未注册,请先注册!");
                login.register();
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if (user.getUsername().equals(list.get(i).getUsername())) {
                        if (user.getPassword().equals(list.get(i).getPassword())) {
                            System.out.println("登录成功!");
                            int score = GuessNumberGame.getScore();
                            user.setScore(score);
                            list.remove(i);
                            list.add(user);
                            System.out.println(list);
                            break A;
                        } else {
                            System.out.println("登录失败!请重新登录!");
                            System.out.println("剩余" + (2 - count) + "次登录机会!");
                            count++;
                            break;
                        }
                    } else {
                        System.out.println("该用户未注册,请先注册!");
                        new UserAction().register();
                        System.out.println("请重新登录!");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void register() {
        UserAction register = new UserAction();
        while (true) {
            System.out.println("请输入新用户名:");
            String username = sc.next();
            if (list1.contains(username)) {
                System.out.println("该用户名已被注册!请重新注册!");
                System.out.println("----------------------------------");
            } else {
                System.out.println("请输入密码:");
                String password = sc.next();
                User user = new User(username, password, 0);
                list.add(user);
                list1.add(user.getUsername());
                System.out.println("注册成功!");
                break;
            }
        }
        register.login();

    }

    @Override
    public void delete() {
        System.out.println("请输入要删除的用户");
        String username = sc.next();
        if (list1.contains(username)) {
            for (int i = 0; i < list.size(); i++) {
                if (username.equals(list.get(i).getUsername())) {
                    list.remove(i);
                    System.out.println("删除完成");
                    break;
                }
            }
        } else {
            System.out.println("不存在该用户!");
        }

    }
}

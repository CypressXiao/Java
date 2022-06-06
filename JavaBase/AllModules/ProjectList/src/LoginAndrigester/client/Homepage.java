package LoginAndrigester.client;

import LoginAndrigester.commonclass.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Homepage
 * @Description 教师管理平台
 * @Author 肖榆柏
 * @Date 2022/5/12 7:54
 * @Version 1.0
 */

public class Homepage {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 6666);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        boolean flag = true;

        System.out.println("********欢迎来到多易教育教师管理平台********");
        do {
            System.out.println("请选择你的操作选项:");
            System.out.println("\t1.登录");
            System.out.println("\t2.注册");
            System.out.println("\t3.退出");
            String choice = Utils.getInput();
            String str1;
            String str2;
            Message m = new Message();
            if (choice.equals("1")) {
                System.out.println("请输入你的登录账号:");
                str1 = Utils.getInput();
                System.out.println("请输入你的登录密码:");
                str2 = Utils.getInput();
                m.setUsername(str1);
                m.setPassword(str2);
                m.setMesType(MesType.MES_TO_LOGIN);
                oos.writeObject(m);

            } else if (choice.equals("2")) {
                System.out.println("请输入你的注册账号:");
                str1 = Utils.getInput();
                System.out.println("请输入你的注册密码:");
                str2 = Utils.getInput();
                System.out.println("请输入你的员工id:");
                String str3 = Utils.getInput();
                m.setUsername(str1);
                m.setPassword(str2);
                m.setId(str3);
                m.setMesType(MesType.MES_TO_REGISTER);
                oos.writeObject(m);

            } else {
                System.out.println("正在退出系统~~");
                return;
            }
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message m1 = (Message) ois.readObject();
            System.out.println(m1.getComment());

            if (m1.getMesType() != null) {
                if (m1.getMesType().equals(MesType.MES_LOGIN_SUC)) {
                    label:
                    do {
                        System.out.println("**********登录后操作页面**********");
                        System.out.println("请选择你的操作选项:");
                        System.out.println("\t1.查看所有学生信息");
                        System.out.println("\t2.删除学生信息");
                        System.out.println("\t3.增加学生信息");
                        System.out.println("\t4.修改学生信息");
                        System.out.println("\t5.退出登录");
                        String s = Utils.getInput();
                        switch (s) {
                            case "1": {
                                m1.setMesType(MesType.MES_TO_LOOK);
                                oos.writeObject(m1);
                                Message m2 = (Message) ois.readObject();
                                List<Student> list = m2.getStus();
                                System.out.println(m2.getUsername()+"的学生信息如下:");
                                System.out.println("学号\t姓名\t\t性别\t年龄");
                                for (Student student : list) {
                                    System.out.println(student.getSid() + "\t" +
                                            student.getSname() + "\t" + student.getSgender() + "\t" + student.getAge());
                                }
                                break;
                            }
                            case "2": {
                                m1.setMesType(MesType.MES_TO_DELETE);
                                System.out.println("请输入要删除学生的姓名:");
                                String str = Utils.getInput();
                                m1.setStuName(str);
                                oos.writeObject(m1);
                                Message m2 = (Message) ois.readObject();
                                System.out.println(m2.getComment());
                                break;
                            }
                            case "3": {
                                m1.setMesType(MesType.MES_TO_ADD);
                                System.out.println("请输入要添加的学生的信息:");
                                Student stu = Utils.stuInfo();
                                m1.setStu(stu);
                                oos.writeObject(m1);
                                Message m2 = (Message) ois.readObject();
                                System.out.println(m2.getComment());
                                break;
                            }
                            case "4": {
                                m1.setMesType(MesType.MES_TO_MODIFY);
                                System.out.println("请输入修改后的学生的信息:");
                                Student stu = Utils.stuInfo();
                                m1.setStu(stu);
                                oos.writeObject(m1);
                                Message m2 = (Message) ois.readObject();
                                System.out.println(m2.getComment());
                                break;
                            }
                            default:
                                m1.setMesType(MesType.MES_TO_SHUTDOWN);
                                oos.writeObject(m1);
                                flag = false;
                                System.out.println("正在退出系统");
                                break label;
                        }
                       /* while (true){
                            Message m2 = (Message) ois.readObject();
                            if(m2.getMesType().equals(MesType.MES_TO_LOOK)){
                                List<Student> list = m2.getStus();
                                System.out.println(m2.getUsername()+"的学生信息如下:");
                                System.out.println("学号\t姓名\t\t性别\t年龄");
                                for (Student student : list) {
                                    System.out.println(student.getSid() + "\t" +
                                            student.getSname() + "\t" + student.getSgender() + "\t" + student.getAge());
                                }
                                break ;
                            }
                            if(m2.getMesType().equals(MesType.MES_TO_DELETE)){
                                System.out.println(m2.getComment());
                                break ;
                            }
                            if(m2.getMesType().equals(MesType.MES_TO_ADD)){
                                System.out.println(m2.getComment());
                                break ;
                            }
                            if (m2.getMesType().equals(MesType.MES_TO_MODIFY)){
                                System.out.println(m2.getComment());
                            }
                            if(m2.getMesType().equals(MesType.MES_TO_SHUTDOWN)){
                                flag = false;
                                System.out.println("正在退出系统");
                                break label;
                            }
                        }*/
                    }
                    while (true);
                }
            }
        } while (flag);
    }
}

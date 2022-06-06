package LoginAndrigester.server;

import LoginAndrigester.commonclass.MesType;
import LoginAndrigester.commonclass.Message;
import LoginAndrigester.commonclass.Student;
import LoginAndrigester.commonclass.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ServerOperation
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/12 9:30
 * @Version 1.0
 */

public class ServerOperation {

    //从数据库中根据输入的用户名及信息进行筛选
    static ComboPooledDataSource pool = new ComboPooledDataSource();
    static QueryRunner qr = new QueryRunner(pool);


    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        while (true) {
            Message m = (Message) ois.readObject();
            Message m1 = new Message();
            String str1 = null;
            if (m.getMesType().equals(MesType.MES_TO_LOGIN)) {
                System.out.println(m.getUsername()+"用户在进行登录操作~~");
                User user = qr.query("select username,password from teacher where username = ? ",
                        new BeanHandler<>(User.class), m.getUsername());
                if (user == null) {
                    str1 = "该用户未注册,请先注册!";
                    m1.setMesType(m.getMesType());
                } else if (user.getPassword().equals(m.getPassword())) {
                    str1 = "登录成功!";
                    m1.setMesType(MesType.MES_LOGIN_SUC);
                } else {
                    str1 = "密码输入错误!";
                    m1.setMesType(m.getMesType());
                }
                m1.setUsername(m.getUsername());
                m1.setPassword(m.getPassword());
                m1.setComment(str1);
                oos.writeObject(m1);

            }
            if (m.getMesType().equals((MesType.MES_TO_REGISTER))) {
                System.out.println(m.getUsername()+"用户在进行注册操作~~");
                User user = qr.query("select username,password from teacher where username = ? ;",
                        new BeanHandler<>(User.class), m.getUsername());
                if(user!=null){
                    str1 ="该用户已注册!";
                }else{
                    qr.update("insert into teacher values(?,?,?);",m.getId(),m.getUsername(),m.getPassword());
                   str1 ="注册成功!";
                }
                m1.setComment(str1);
                oos.writeObject(m1);
            }
            if(m.getMesType().equals(MesType.MES_TO_LOOK)){
                ArrayList<Student> query =(ArrayList<Student>) qr.query("select student.* from student,teacher where username =? and teacher.tid = student.tid;",
                        new BeanListHandler<>(Student.class), m.getUsername());
                m1.setUsername(m.getUsername());
                m1.setStus(query);
                m1.setMesType(MesType.MES_TO_LOOK);
                oos.writeObject(m1);

            }
            if(m.getMesType().equals(MesType.MES_TO_DELETE)){
                qr.update("delete from student where sname = ?",m.getStuName());
                m1.setComment("删除学生"+m.getStuName()+"成功!");
                m1.setMesType(MesType.MES_TO_DELETE);
                oos.writeObject(m1);

            }
            if(m.getMesType().equals(MesType.MES_TO_ADD)){
                qr.update("insert into student values (?,?,?,?,?)",m.getStu().getSid(),m.getStu().getSname(),
                        m.getStu().getAge(),m.getStu().getSgender(),m.getStu().getTid());
                m1.setComment("添加学生"+m.getStu().getSname()+"成功!");
                m1.setMesType(MesType.MES_TO_ADD);
                oos.writeObject(m1);

            }
            if(m.getMesType().equals(MesType.MES_TO_MODIFY)){
                qr.update("update student sname =?,age =?,sgender =?,tid =? where sid =?; ",m.getStu().getSname(),
                        m.getStu().getAge(),m.getStu().getSgender(),m.getStu().getTid(),m.getStu().getSid());
                m1.setComment("修改学生"+m.getStu().getSname()+"信息成功!");
                m1.setMesType(MesType.MES_TO_MODIFY);
                oos.writeObject(m1);
            }
            if(m.getMesType().equals(MesType.MES_TO_SHUTDOWN)){
                oos.writeObject(m1);
                pool.close();
                break;
            }
        }
    }
}

package rpc_client.src.client;

import rpc_client.src.common_class.Information;
import rpc_client.src.common_class.MessageBean;
import rpc_client.src.common_class.User;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Properties;

/**
 * @ClassName ClientRequest
 * @Description 此类用来向服务端发送请求并结束结果
 * @Author 肖榆柏
 * @Date 2022/5/5 19:56
 * @Version 1.0
 */

public class ClientRequest {
    //向服务端发送请求的消息
    public static void sendRequest() throws Exception {
        //创建配置文件对象,并加载配置文件所在位置
        Properties pro = new Properties();
        pro.load(ClientRequest.class.getClassLoader().getResourceAsStream("config\\client_request.properties"));
        //创建messageBean对象
        final MessageBean mb = new MessageBean();
        //先传入要使用的类对的名字及其方法名
        mb.setClassName(pro.getProperty("className"));
        mb.setMethodName(pro.getProperty("methodName"));
        //创建一个user对象,并将其user及其Class对象封装到mb中
        final User user = new User(pro.getProperty("username"), pro.getProperty("password"));
        mb.setParas(new Class[]{user.getClass()});
        mb.setUser(user);

        //创建一个和服务端建立连接的Socket对象
        Socket s = new Socket(InetAddress.getByName("127.0.0.1"),6666);
        //创建一个对象流,将mb穿发送给server进行处理
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(mb);
        s.shutdownOutput();

        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        final Information info =(Information) ois.readObject();
        System.out.println(info.getInfo());


    }
}

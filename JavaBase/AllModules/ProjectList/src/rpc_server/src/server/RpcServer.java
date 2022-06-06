package rpc_server.src.server;

import rpc_server.src.common_class.Information;
import rpc_server.src.common_class.MessageBean;
import rpc_server.src.common_class.UserImpl;

import java.io.*;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName RpcServer
 * @Description 服务端处理来自客户端的信息
 * @Author 肖榆柏
 * @Date 2022/5/5 20:24
 * @Version 1.0
 */

public class RpcServer {
    public static void main(String[] args) throws Exception {
        //监听6666端口号,建立与客户端的练习
        final ServerSocket ss = new ServerSocket(6666);
        final Socket s = ss.accept();
        //读取来自客户端的mb消息,并向下转型
        final ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        MessageBean mb = (MessageBean) ois.readObject();

        //读取到消息后,根据消息中的类名和方法以及用户信息进行操作
        //获取对应类的Class对象
        final Class<?> clazz = Class.forName(mb.getClassName());
        final UserImpl uip =(UserImpl) clazz.newInstance();
        final Method mt = clazz.getDeclaredMethod(mb.getMethodName(), mb.getParas()[0]);
        //调用传来的方法
        final String info =(String) mt.invoke(uip, mb.getUser());
        //将返回的消息写回
        final Information information = new Information(info);
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(information);

    }
}

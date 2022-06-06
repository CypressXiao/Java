package JavaBase.day5_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        //服务端进行接收
        try {
            ServerSocket ss = new ServerSocket(6666);
            //开始监听是否有客户端连接服务器
            Socket s = ss.accept();
            //获取管道中的输入流
            final InputStream is = s.getInputStream();

            byte[] bs = new byte[1024];
            int len;
            while ((len = is.read(bs)) !=-1){
                System.out.println(new String(bs,0,len));
            }

            is.close();
            s.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

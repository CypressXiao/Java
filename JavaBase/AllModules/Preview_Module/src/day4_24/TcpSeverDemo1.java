package day4_24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpSeverDemo1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//要和客户端建立连接
            InputStream in = s.getInputStream();
            byte[] bs = new byte[1024];
            int len;
            while((len = in.read(bs))!=-1){
                System.out.println(new String(bs,0,len));
            }

            OutputStream out = s.getOutputStream();
            out.write("不在,怎么了?".getBytes());

            out.close();
            in.close();
            s.close();
            ss.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

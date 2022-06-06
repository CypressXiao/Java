package JavaBase.day5_1;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 编写一个服务端和客户端
 * 服务器在8888端口监听
 * 客户端连接到服务端,发送一张图片(地址自己选择)
 * 服务器端收到图片,保存到src下,发送收到图片再退出
 * 客户端收到服务器端发送的收到图片,再退出
 */
public class TCPClient3 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Cypress_Xiao\\Desktop\\肖榆柏-本科成绩单\\肖榆柏-初始成绩单.jpg");
        //创建一个缓冲流用于读取本机图片
        BufferedInputStream bis = new BufferedInputStream((new FileInputStream(f)));

        //读取本机图片的同时,写入服务器端口
        Socket s = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream os = s.getOutputStream();

        byte[] bs = new byte[1024];
        int len;
        while((len = bis.read(bs))!=-1){
            os.write(bs,0,len);
        }
        s.shutdownOutput();

        //接收到服务端发回的收到图片退出
        InputStream is = s.getInputStream();
        byte[] bs1 = new byte[1024];
        int len1;
        while((len1 = is.read(bs1))!=-1){
            System.out.println(new String(bs1,0,len1));
        }

        //关流
        is.close();
        os.close();
        s.close();
        bis.close();
    }
}

package JavaBase.day5_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 编写客户端和服务端
 * 客户端输入一个MP4文件名,服务端收到mp4名后,可以给客户端返回这个mp4文件,如果服务器没有这个文件,则返回一个默认的mp4文件即可
 * 客户端收到这个文件后,保存到本地e:\\
 */

public class TCPServer4 {
    public static void main(String[] args) throws IOException {
        //监听客户端的连接
        ServerSocket serverSocket = new ServerSocket(6666);
        //与客户端建立连接
        Socket socket = serverSocket.accept();
        //服务端接收来自客户端的文件信息,使用缓冲流读取
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bs = new byte[8 * 1024];
        int len;

        bufferedInputStream.read(bs);
        String s = new String(bs, 0, bs.length);
        socket.shutdownInput();

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        //判断该读取的文件存在,目的文件名
        String s1 = "D:\\课程文件\\day01\\视频\\22.总结.mp4";
        if(s1.equals(s)){
            System.out.println("文件存在,开始传输!");
        }else{
            System.out.println("文件不存在,开始传输默认文件");
        }
        //从主机中读取数据的流
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(s1));
        //可以用上边的数组
        while((len = bufferedInputStream1.read(bs))!=-1){
            bufferedOutputStream.write(bs,0,len);
        }
        System.out.println("传输完毕!即将关流!");
        bufferedInputStream1.close();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        socket.close();
        serverSocket.close();

    }

}

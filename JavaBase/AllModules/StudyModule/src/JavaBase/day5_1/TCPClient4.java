package JavaBase.day5_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient4 {
    public static void main(String[] args) throws IOException {
        //申请与服务端连接
        Socket socket = new Socket(InetAddress.getByName("localhost"), 6666);

        //输入一个MP4文件名
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.next();

        //将文件名传递给服务端,使用缓冲流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(filename.getBytes());
        //缓冲流记得刷新
        bufferedOutputStream.flush();
        socket.shutdownOutput();

        //接收服务端传回的信息
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        final BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream("D:/a.mp4"));
        byte[] bs = new byte[8*1024];
        int len;
        while((len = bufferedInputStream.read(bs))!=-1){
            bufferedOutputStream1.write(bs,0,len);
            bufferedOutputStream1.flush();
        }

        //关流
        bufferedOutputStream1.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();

    }
}

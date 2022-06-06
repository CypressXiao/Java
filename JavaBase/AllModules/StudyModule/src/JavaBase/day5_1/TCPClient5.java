package JavaBase.day5_1;


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 从本地主机获取一个文件传输给另一个主机并保存
 */
public class TCPClient5 {
    public static void main(String[] args) throws IOException {
        //从本地读取视频文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\课程文件\\day01\\视频\\13.入门程序.mp4"));
        Socket socket = new Socket(InetAddress.getByName("localhost"), 6666);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bs = new byte[8 * 1024];
        int len;
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
            bos.flush();
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len = is.read(bs)) != -1) {
            System.out.println(new String(bs, 0, len));
        }

        is.close();
        bos.close();
        socket.close();
        bis.close();
    }
}

package JavaBase.day5_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer3 {
    public static void main(String[] args) throws IOException {
        //监听客户端是否建立连接
        ServerSocket ss = new ServerSocket(8888);
        final Socket s = ss.accept();

        //接收客户端传入的数据并将其写入对应的文件中
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\alllearning\\JavaBase\\AllModules\\StudyModule\\src\\a.avi"));
        InputStream is = s.getInputStream();

        byte[] bs = new byte[1024];
        int len;
        while((len = is.read(bs))!=-1){
            bos.write(bs,0,len);
        }//-1是读完的结束条件,故不需加shutdownInput()


        //写完后返回收到图片
        final OutputStream os = s.getOutputStream();
        os.write("收到图片".getBytes());
        s.shutdownOutput();

        //关流
        os.close();
        is.close();
        bos.close();
        s.close();
        ss.close();

    }
}

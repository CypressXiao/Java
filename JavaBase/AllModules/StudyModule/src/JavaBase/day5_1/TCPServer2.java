package JavaBase.day5_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            final Socket s = ss.accept();
            final InputStream is = s.getInputStream();
            final OutputStream os = s.getOutputStream();

            byte[] bs = new byte[1024];
            int len;
            while ((len = is.read(bs)) != -1) {
                System.out.println(new String(bs, 0, len));
            }

            os.write("hello,client".getBytes());
            s.shutdownOutput();//写入结束的标记

            os.close();
            is.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

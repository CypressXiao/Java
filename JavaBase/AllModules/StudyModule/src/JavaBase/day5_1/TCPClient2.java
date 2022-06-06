package JavaBase.day5_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 9999);
            final OutputStream os = s.getOutputStream();
            final InputStream is = s.getInputStream();
            os.write("hello,server".getBytes());
            s.shutdownOutput();//写入结束的标记

            byte[] bs = new byte[1024];
            int len;
            while((len = is.read(bs))!=-1){
                System.out.println(new String(bs,0,len));
            }

            is.close();
            os.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

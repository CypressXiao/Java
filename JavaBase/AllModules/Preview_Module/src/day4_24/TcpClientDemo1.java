package day4_24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientDemo1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1",6666);
            final OutputStream out = s.getOutputStream();
            out.write("早上好,在干啥呢".getBytes());
            s.shutdownOutput();

            InputStream in = s.getInputStream();
            byte[] bs = new byte[1024];
            int len;
            while((len = in.read(bs))!=-1){
                System.out.println(new String(bs,0,len));
            }

            in.close();
            out.close();
            s.close();



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

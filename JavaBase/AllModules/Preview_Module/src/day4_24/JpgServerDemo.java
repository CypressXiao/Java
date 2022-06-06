package day4_24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JpgServerDemo {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            while (true) {
                Socket s = ss.accept();
                final ExecutorService pool = Executors.newFixedThreadPool(10);
                pool.execute(new UpLoad(s));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class UpLoad implements Runnable {
    Socket s;

    public UpLoad(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\copy\\" + System.nanoTime() + ".jpg"));
            byte[] bs = new byte[1024];
            int len;
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }
            bos.flush();
            bos.close();
            bis.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

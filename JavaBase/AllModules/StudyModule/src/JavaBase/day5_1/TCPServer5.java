package JavaBase.day5_1;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TCPServer5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        final ExecutorService pool = Executors.newFixedThreadPool(10);

        while (true) {
            Socket s = ss.accept();
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\b.avi"));
                        byte[] bs = new byte[8 * 1024];
                        int len;
                        while ((len = bis.read(bs)) != -1) {
                            bos.write(bs, 0, len);
                            bos.flush();
                        }

                        OutputStream os = s.getOutputStream();
                        os.write("上传成功!".getBytes());
                        s.shutdownOutput();

                        os.close();
                        bos.close();
                        bis.close();
                        s.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}

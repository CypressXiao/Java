package day4_24;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo3 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            final Socket s = ss.accept();
            InetAddress ip =s.getInetAddress();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            byte[] bs = new byte[1024];
            String str;
            while((str =br.readLine())!=null){
                System.out.println(str);
                bw.write(str.toUpperCase());
                bw.newLine();
                bw.flush();
            }

            br.close();
            s.close();
            ss.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package day4_24;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            Socket s =ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(br.readLine());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("在做午饭!");
            bw.newLine();
            bw.flush();

            bw.close();
            br.close();
            s.close();
            ss.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

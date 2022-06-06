package day4_24;

import java.io.*;
import java.net.Socket;

public class TcpClientDemo2 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost",1111);
            OutputStream out = s.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
            bw.write("你在干啥呢?");
            bw.newLine();
            bw.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println(br.readLine());

            br.close();
            bw.close();
            out.close();
            s.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

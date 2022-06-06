package day4_24;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

//客户端通过键盘录入一个字符串,传送给服务端,并通过服务端打印;并将其转换成大写字母返回给客户端
public class TcpClientDemo3 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 6666);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            Scanner sc = new Scanner(System.in);
            String line;
            while ((line = sc.nextLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
                if ("over".equals(line.toLowerCase())) {
                    break;
                }
                System.out.println(br.readLine());
            }
            bw.close();
            s.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




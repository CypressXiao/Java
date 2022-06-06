package JavaBase.day5_1;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient1 {
    public static void main(String[] args) {
        try (
                //创建一个Socket对象
                final Socket s = new Socket("127.0.0.1", 6666);
                //获取客户端的输入输出流并转换为高效流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()))
        ) {
            InetAddress ip = s.getInetAddress();
            Scanner sc = new Scanner(System.in);
            while(true){
                String info =sc.next();
                //循环环输入内容
                bw.write(info);
                bw.newLine();//这样写,服务端才知道写完了
                bw.flush();
                //循环接收内容
                System.out.println(ip.getHostAddress()+":"+br.readLine());
                if("bye".equals(info) || br.readLine().equals("bye")) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

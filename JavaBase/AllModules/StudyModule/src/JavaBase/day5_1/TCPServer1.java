package JavaBase.day5_1;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer1 {
    public static void main(String[] args) {
        try (
                //创建监视器
                ServerSocket ss = new ServerSocket(6666);
                //监视器监听是否有客户端连接
                Socket s = ss.accept();
                //创建高效输出流和输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))
        ) {
            InetAddress ip = s.getInetAddress();
            Scanner sc = new Scanner(System.in);
            //循环读取和写
            while(true){
                System.out.println(ip.getHostAddress()+":"+ br.readLine());
                String s1 = sc.next();
                bw.write(s1);
                bw.newLine();
                bw.flush();//必须刷新,不然写不进去

                if(br.readLine().equals("byte") || "bye".equals(s1)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

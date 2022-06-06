package JavaBase.day5_1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPSend1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1024);//UDP返回时要重新建立端口号,因为我们用的是一台机器在操作

        byte[] bs = "hello,明天吃火锅~".getBytes();

        InetAddress ip = InetAddress.getLocalHost();

        DatagramPacket dp1 = new DatagramPacket(bs, 0, bs.length, ip, 9999);

        ds.send(dp1);

        DatagramPacket dp2 = new DatagramPacket(new byte[64 * 1024], 64 * 1024);
        ds.receive(dp2);


        System.out.println(new String(dp2.getData(), 0, dp1.getLength()));


        ds.close();

    }
}

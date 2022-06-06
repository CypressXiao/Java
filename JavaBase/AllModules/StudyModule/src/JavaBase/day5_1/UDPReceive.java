package JavaBase.day5_1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceive {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(8888);
            //封装一个接收数据的包
            DatagramPacket dp = new DatagramPacket(new byte[1024*64],1024*64);
            //将数据包接收过来
            ds.receive(dp);
            //获取接收数据的数组
            byte[] bs = dp.getData();
            //获取实际接收的数据长度
            int len = dp.getLength();
            //获取发送端的IP地址
            InetAddress ip = dp.getAddress();
            System.out.println(ip.getHostAddress()+":"+new String(bs,0,len));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

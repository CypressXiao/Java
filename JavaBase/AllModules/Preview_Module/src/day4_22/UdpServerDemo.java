package day4_22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServerDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(6666);
            DatagramPacket dp = new DatagramPacket(new byte[64*1024],64*1024);

            ds.receive(dp);
            byte[] bs = dp.getData();
            int len = dp.getLength();
            InetAddress ip = dp.getAddress();
            String str = new String(bs,0,len);
            System.out.println(ip.getHostAddress()+":"+str);
            ds.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

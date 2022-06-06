package day4_22;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClientDemo {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String s ="在吗?睡了吗?";
            byte[] bs = s.getBytes();
            DatagramPacket dp = new DatagramPacket(bs,bs.length, InetAddress.getLocalHost(),6666);
            ds.send(dp);
            ds.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

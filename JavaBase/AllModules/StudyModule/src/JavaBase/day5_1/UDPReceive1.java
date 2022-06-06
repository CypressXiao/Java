package JavaBase.day5_1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceive1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9999);

        DatagramPacket dp1 = new DatagramPacket(new byte[64*1024],64*1024);

        ds.receive(dp1);

        System.out.println(new String(dp1.getData(), 0, dp1.getLength()));


        final InetAddress ip = dp1.getAddress();
        byte[] bs = "好的,明天见!".getBytes();
        DatagramPacket dp2 = new DatagramPacket(bs,0,bs.length,ip,1024);
        ds.send(dp2);

        ds.close();

    }
}

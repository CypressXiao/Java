package day4_24;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoomSeverDemo implements Runnable {

    @Override
    public void run() {
        try {
            DatagramSocket ds = new DatagramSocket(1111);
            DatagramPacket dp = new DatagramPacket(new byte[64 * 1024], 64 * 1024);
            while (true) {
                ds.receive(dp);
                System.out.println(dp.getAddress().getHostAddress() + ":" + new String(dp.getData(), 0, dp.getLength()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

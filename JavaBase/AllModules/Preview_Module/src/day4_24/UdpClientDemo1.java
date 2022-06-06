package day4_24;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UdpClientDemo1 {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            Scanner sc = new Scanner(System.in);
            String line;
            while ((line = sc.nextLine()) != null) {
                DatagramPacket dp = new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getLocalHost(),9999);
                ds.send(dp);
                if("over".equals(line)){
                    break;
                }
            }
            ds.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package day4_22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip =InetAddress.getLocalHost();
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try {
            InetAddress ip1 = InetAddress.getByName("LAPTOP-T3RCHK31");
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

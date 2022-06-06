package JavaBase.day5_1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        final InetAddress byName = InetAddress.getByName("LAPTOP-T3RCHK31");
        System.out.println(byName);
        final InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        System.out.println(localHost.getHostName());
        System.out.println(localHost.getHostAddress());
    }
}

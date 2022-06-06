package JavaBase.day5_1;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSend {
    public static void main(String[] args) {
        try {
            //创建一个UDP的对象
            DatagramSocket ds = new DatagramSocket();
            //需要发送的内容
            byte[] bs = "你好,在吗?".getBytes();
            //发送给哪台机器获取那台机器的ip地址对象
            InetAddress ip = InetAddress.getLocalHost();
            //将数据进行打包
            DatagramPacket dp = new DatagramPacket(bs,0,bs.length,ip,8888);
            //开始发送
            ds.send(dp);
            //关闭发送端
            ds.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package JavaBase.day5_1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) {
        //在客户端中,创建一个socket对象
        try {
            Socket s = new Socket("localhost", 6666);

            //获取socket流中的输出流,往服务端写数据
            OutputStream os = s.getOutputStream();

            os.write("你好,睡了吗?".getBytes());
            os.close();
            s.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

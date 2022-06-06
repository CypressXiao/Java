package day4_24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;

public class JpgClientDemo {
    public static void main(String[] args) {
        for (int i =0;i<10;i++) {
            try {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\view.jpg"));
                Socket s= new Socket("127.0.0.1",1111);
                BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

                byte[] bs = new byte[1024];
                int len;
                while((len = bis.read(bs))!=-1){
                    bos.write(bs,0,len);
                }

                bos.flush();
                bos.close();
                s.close();
                bis.close();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

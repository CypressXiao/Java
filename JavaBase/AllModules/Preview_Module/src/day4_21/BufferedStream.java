package day4_21;

import java.awt.*;
import java.io.*;

public class BufferedStream {
    public static void main(String[] args) {
        try(
            BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\a.txt",true));
            BufferedInputStream bf1 = new BufferedInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\a.txt"));
            BufferedOutputStream bf2 = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt"));

        ) {
            byte[] bs = new byte[1024];
            bf.write("学如逆水行舟,不进则退!".getBytes());
            bf.close();
            int len;
            while((len = bf1.read(bs))!=-1){
                bf2.write(bs,0,len);
            }
            bf2.flush();

            System.out.println("复制成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

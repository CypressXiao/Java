package day4_18;

import java.io.*;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        /*try(
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt",false);
            ) {
            fos.write(97);
            fos.write(98);
            fos.write(99);
            fos.write("千里之行始于足下".getBytes());


        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try (
            FileInputStream fis = new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt")
        ){
            int a =fis.read();
            int b =fis.read();
            int c =fis.read();
            System.out.println((char)a);
            System.out.println((char)b);
            System.out.println((char)c);

            int d =fis.read();
            int e =fis.read();
            int f =fis.read();

            byte[] bs ={(byte)d,(byte)e,(byte)f};
            System.out.println(new String(bs));

            byte[] bbs = new byte[1024];
            int len = fis.read(bbs);
            System.out.println(new String(bbs,0,len));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

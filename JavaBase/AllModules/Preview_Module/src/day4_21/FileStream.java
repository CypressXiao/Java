package day4_21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStream {
    public static void main(String[] args) {
        try(
            FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt",true);
            FileInputStream fis = new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\a.txt");
            ) {
            byte[] bs = new byte[1024];
            int len1;
            while((len1 =fis.read(bs))!=-1){
                fos1.write(bs,0,len1);
            }
            System.out.println("复制成功!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package day4_18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(
            FileReader fr = new FileReader("C:\\Users\\Cypress_Xiao\\Desktop\\test\\f.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Cypress_Xiao\\Desktop\\test\\g.txt")
                ) {
            char[] chs = new char[1024];
            int len;
            while((len = fr.read(chs)) !=-1){
                fw.write(chs,0,len);
            }
            System.out.println("复制成功!");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

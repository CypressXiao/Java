package day4_21;

import javax.annotation.processing.Filer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndReader {
    public static void main(String[] args) {
        try(
            FileWriter fw = new FileWriter("C:\\Users\\Cypress_Xiao\\Desktop\\test\\d.txt",true);
            FileWriter fw1 = new FileWriter("C:\\Users\\Cypress_Xiao\\Desktop\\test\\e.doc",true);
            FileReader fr = new FileReader("C:\\Users\\Cypress_Xiao\\Desktop\\test\\d.txt")
            ) {
            char[] ch = new char[1024];
            fw.write("宁吃少来苦,不吃老来贫!");
            fw.close();
            int len;
            while((len = fr.read(ch))!=-1){
                fw1.write(ch,0,len);
            }
            System.out.println("复制成功!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

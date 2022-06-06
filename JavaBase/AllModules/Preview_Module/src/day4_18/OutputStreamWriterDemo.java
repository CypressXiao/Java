package day4_18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        try(
                OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\d.doc"))
        ) {
            osr.write(97);
            char[] chs ={'好','好','学','习'};
            osr.write(chs);

            osr.write("天天向上");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

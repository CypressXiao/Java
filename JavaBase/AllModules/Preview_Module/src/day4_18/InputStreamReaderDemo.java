package day4_18;

import java.io.*;


public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try(
            InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\d.doc"));
            OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\e.doc"))
            ) {
            char[] chs = new char[1024];
            int len;
            while((len = isr.read(chs))!=-1){
                osr.write(chs,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

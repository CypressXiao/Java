package day4_21;

import java.io.*;

public class ReaderAndWriter {
    public static void main(String[] args) {
        try(
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt",true));
            InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt")) ;
            OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\c.txt"));
        ) {
            char[] cha = new char[1024];
            osw.write("吃得苦中苦,方为人上人!".toCharArray());
            osw.flush();
            osw.close();
            int len;
            while((len=isr.read(cha))!=-1){
                osw1.write(cha,0,len);
            }
            osw1.flush();
            System.out.println("复制成功!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

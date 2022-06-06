package day4_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\d.txt")))

            ) {
            /*char[] chs = new char[1024];
            int len;
            while((len =br.read(chs))!=-1){
                System.out.println(new String(chs,0,len));
            }*/
            System.out.println(br.readLine());
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

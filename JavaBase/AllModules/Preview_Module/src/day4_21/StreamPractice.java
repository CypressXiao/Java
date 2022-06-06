package day4_21;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList("张三","李四","王五"));

        try(
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\h.txt",true)));
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\h.txt")))
            ) {
            for (String s : list) {
               bw.write(s.toCharArray());
               bw.newLine();
               bw.flush();
            }
            System.out.println("写入成功!");
            bw.close();
            String s;
            while ((s = br.readLine())!= null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

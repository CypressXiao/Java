package day4_21;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        try (
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\c.txt", true)));
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\d.txt")));
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\c.txt")));
        ) {
            char[] ch = new char[1024];
            bw.newLine();
            bw.write("天将降大任于斯人也,必先苦其心志,劳其筋骨,饿其体肤,空乏其身!");
            bw.flush();
            bw.close();
            int len;
            while ((len = br.read(ch)) != -1) {
                bw1.write(ch, 0, len);
                bw1.flush();
            }
            System.out.println("复制成功!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package day4_18;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\g.txt")));
            ) {
            bw.write("天将降大任于斯人也,");
            bw.newLine();
            bw.newLine();
            bw.write("必先苦其心志,劳其筋骨!");
            bw.newLine();
            bw.newLine();
            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

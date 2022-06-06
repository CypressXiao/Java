package day4_18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try(
            FileWriter fw = new FileWriter("C:\\Users\\Cypress_Xiao\\Desktop\\test\\f.txt");
            ) {
            fw.write("锄禾日当午,汗滴禾下土.谁知盘中餐,粒粒皆辛苦");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

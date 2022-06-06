package JavaBase.day4_26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\a.txt");
            fos.write("hello world".getBytes());
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

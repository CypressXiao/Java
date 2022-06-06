package day4_18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\b.txt", true);
        ) {
            fos.write("aaa".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


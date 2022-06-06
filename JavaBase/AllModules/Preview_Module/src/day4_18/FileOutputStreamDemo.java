package day4_18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\a.txt");
            fos.write(98);
            fos.write("肖榆柏能找个好工作!".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(!(fos == null)) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

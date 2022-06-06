package day4_18;

import java.io.DataOutput;
import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\Cypress_Xiao\\Desktop\\pictures");
        File[] f = f1.listFiles();
        for (File file : f) {
            if(file.getAbsolutePath().endsWith(".jpg")){
                System.out.println(file.getName());
            }
        }
    }
}

package day4_18;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File f1 = new File("D:/");
        String[] str = f1.list();
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());
        }
    }
}

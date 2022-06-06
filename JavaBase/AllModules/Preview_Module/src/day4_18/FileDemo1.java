package day4_18;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/a.txt");
        File f2 =new File("D:/A/B/C");

        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}

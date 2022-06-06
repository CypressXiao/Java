package day4_18;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:/A/B/a.text");
        f1.createNewFile();
        System.out.println(f1.exists());
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getPath());
        System.out.println(f1.length());
        System.out.println(f1.lastModified());
        String s = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(f1.lastModified());
        System.out.println(s);
    }
}

package day4_21;

import java.io.File;
import java.io.IOException;

public class FileLoop {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Cypress_Xiao\\Desktop\\test";
        getJpg(path);

    }

    public static void getJpg(String path) {
        File f = new File(path);
        if (f.isFile()) {
            if (f.getAbsolutePath().toLowerCase().endsWith(".jpg".toLowerCase())) {
                System.out.println(f.getAbsolutePath());
            }
        } else {
            File[] ff = f.listFiles();
            if (ff != null && ff.length > 0) {
                for (File file : ff) {
                    getJpg(file.getAbsolutePath());
                }
            }
        }
    }
}

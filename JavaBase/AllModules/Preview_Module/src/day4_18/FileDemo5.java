package day4_18;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo5 {
    public static void main(String[] args) {
        getJpg("C:\\Users\\Cypress_Xiao\\Desktop\\pictures",".jpg");
    }

    public static void getJpg(String path,String suffix){
        File f1 = new File(path);
        File[] f = f1.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                File ff = new File(dir, name);
                if (ff.isFile() && name.toLowerCase().endsWith(suffix.toLowerCase())) {
                    return true;
                }
                return false;
            }
        });
        for (File file : f) {
            System.out.println(file.getAbsolutePath());
        }
    }
}

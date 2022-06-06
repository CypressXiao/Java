package day4_18;

import java.io.File;
import java.io.FilenameFilter;

//递归调用目录下指定文件名的名称
public class FileDemo6 {
    public static void main(String[] args) {
        getName("C:\\Users\\Cypress_Xiao\\Desktop\\pictures", ".jpg");
    }

    public static void getName(String path, String suffix) {
        File f = new File(path);
        if (f.isFile() && f.getAbsolutePath().toLowerCase().endsWith(suffix.toLowerCase())) {
            System.out.println(f.getName());
        } else {
            File[] f1 = f.listFiles();
            if (!(f1 == null) && f1.length > 0) {
                for (File file : f1) {
                    getName(file.getAbsolutePath(), suffix);
                }
            }
        }
    }
}

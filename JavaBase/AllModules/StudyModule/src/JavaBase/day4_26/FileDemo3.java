package JavaBase.day4_26;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo3 {
    public static void main(String[] args) {
        String s ="C:\\Users\\Cypress_Xiao\\Desktop\\pictures";
        File f = new File(s);
        /*File[] f1 = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f1 = new File(dir,name);
                if(f1.getName().toLowerCase().endsWith("jpg")){
                    return true;
                }
                return false;
            }
        });
        for (File file : f1) {
            System.out.println(file);
        }*/
        File[] f1 = f.listFiles();
        for (File file : f1) {
            if(file.isFile() && file.getName().endsWith("jpg")){
                System.out.println(file.getAbsolutePath());
            }
        }
        File[] f2 =f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().toLowerCase().endsWith("jpg");
            }
        });
        for (File file : f2) {
            System.out.println(file);
        }
    }
}

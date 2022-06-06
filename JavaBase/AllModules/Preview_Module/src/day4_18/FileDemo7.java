package day4_18;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Cypress_Xiao\\Desktop\\picture";
        deleteAllFiles(path);
    }

    public static void deleteAllFiles(String path){
        File f = new File(path);
        if (!f.isFile()) {
            File[] ff = f.listFiles();
            if (!(ff == null) && ff.length > 0) {
                for (File file : ff) {
                    deleteAllFiles(file.getAbsolutePath());
                }
            }
        }
        f.delete();
    }
}

package day4_21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FilePractice {
    public static void main(String[] args) {
        String path1 = "C:\\Users\\Cypress_Xiao\\Desktop\\test";
        String path2 = "C:\\Users\\Cypress_Xiao\\Desktop\\pic";
        String suffix = "jpg";
        String changeSuffix = "doc";
        copyFilesAndRename(path1, path2, suffix, changeSuffix,0);

    }

    public static void copyFilesAndRename(String path1, String path2, String suffix, String changeSuffix,int count) {
        File file1 = new File(path1);
        final File file2;
        if (count == 0) {
            file2 = new File(path2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
        }
        count++;
        if (file1.isFile()) {
            if (file1.getAbsolutePath().toLowerCase().endsWith(suffix.toLowerCase())) {
                String s = file1.getName().replaceAll("(.+\\.)([Jj][Pp][Gg])", ("$1" + changeSuffix));
                try (
                        FileOutputStream fos = new FileOutputStream(path2 + "\\\\" + s);
                        FileInputStream fis = new FileInputStream(file1.getAbsolutePath())
                ) {
                    byte[] bs = new byte[1024];
                    int len;
                    while ((len = fis.read(bs)) != -1) {
                        fos.write(bs, 0, len);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            File[] ff = file1.listFiles();
            if (ff != null && ff.length > 0) {
                for (File file : ff) {
                    copyFilesAndRename(file.getAbsolutePath(), path2, suffix, changeSuffix,count);
                }
            }
        }
    }
}


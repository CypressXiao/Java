package JavaBase.day4_28;


import javax.lang.model.element.VariableElement;
import java.io.*;
import java.util.Properties;

public class ReviewDemo1 {
    public static void main(String[] args) {
        File srcDir = new File("D:\\课程文件\\day01");
        File desDir = new File("C:\\Users\\Cypress_Xiao\\Desktop");
        copyAllFile(srcDir, desDir);

    }

    public static void copyAllFile(File srcDir, File desDir) {
        if (srcDir.isDirectory()) {
            File newDir = new File(desDir, srcDir.getName());
            if (!newDir.exists()) {
                newDir.mkdirs();
            }
            File[] f = srcDir.listFiles();
            for (File file : f) {
                copyAllFile(file, newDir);
            }
        } else {
            copyFile(srcDir, desDir);
        }
    }

    public static void copyFile(File srcDir, File desDir) {
        File f = new File(desDir, srcDir.getName());
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcDir));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));
        ) {
                byte[] bs = new byte[1024];
                int len;
                while((len = bis.read(bs))!=-1){
                    bos.write(bs,0,len);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

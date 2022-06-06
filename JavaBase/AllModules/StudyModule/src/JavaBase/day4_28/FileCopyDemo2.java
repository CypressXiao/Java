package JavaBase.day4_28;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyDemo2 {
    public static void main(String[] args) {
        String s = "C:\\Users\\Cypress_Xiao\\Desktop\\day01";
        String s1 = "D:";
        copyAll(s,s1);
    }

    public static void copyAll(String s,String s1) {
        File f = new File(s);
        if (f.isFile()) {
            try (
                    FileInputStream fis = new FileInputStream(f.getAbsolutePath());
                    FileOutputStream fos = new FileOutputStream(s1+"\\"+f.getName())
            ) {
                    byte[] bs = new byte[4*1024];
                    int len;
                    while((len =fis.read(bs))!=-1){
                        fos.write(bs,0,len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            String s2 = s1+"\\"+f.getName();
            File ff = new File(s2);
            ff.mkdirs();
            File[] f1 = f.listFiles();
            for (File file : f1) {
                copyAll(file.getAbsolutePath(),s2);
            }
        }
    }
}

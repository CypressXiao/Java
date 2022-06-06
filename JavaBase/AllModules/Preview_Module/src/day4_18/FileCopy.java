package day4_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopy {
    public static void main(String[] args) {
        String s1 ="D:\\课程文件\\day02\\视频\\13.类型的强制转换.mp4";
        String s2 ="C:\\Users\\Cypress_Xiao\\Desktop\\test\\copy.mp4";
       copyFile(s1,s2);
    }

    public static void copyFile(String srcPath,String desPath){
        long start =System.currentTimeMillis();
        try(
            FileInputStream fis = new FileInputStream(srcPath);
            FileOutputStream fos = new FileOutputStream(desPath)
                ) {
            byte[] bs = new byte[1024];
            int len;
            while((len = fis.read(bs)) != -1){
                fos.write(bs,0,len);
            }
            long end =System.currentTimeMillis();
            System.out.println("拷贝成功!耗时"+(end-start)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

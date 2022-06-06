package day4_18;

import java.io.*;

public class BufferFileOutputPrintDemo {
    public static void main(String[] args) {
        String s1 ="D:\\课程文件\\day02\\视频\\13.类型的强制转换.mp4";
        String s2 ="C:\\Users\\Cypress_Xiao\\Desktop\\test\\copy.mp4";
        bufferCopyFile(s1,s2);
    }

    public static void bufferCopyFile(String srcPath,String desPath){
        long start = System.currentTimeMillis();
        try(
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desPath));
                ) {
            byte[] bs =new byte[1024];
            int len;
            while((len =bis.read(bs)) != -1){
                bos.write(bs,0,len);
            }
            long end = System.currentTimeMillis();
            System.out.println("复制成功,耗时"+(end-start)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

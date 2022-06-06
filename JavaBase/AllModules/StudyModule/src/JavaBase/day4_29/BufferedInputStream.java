package JavaBase.day4_29;

import java.io.*;

public class BufferedInputStream {
    public static void main(String[] args) {
        norCopy();
        bufferCopy();
    }

    private static void bufferCopy() {
        long t1 = System.currentTimeMillis();
        try (
                final FileInputStream fis = new FileInputStream("D:\\课程文件\\day01\\视频\\13.入门程序.mp4");
                final FileOutputStream fos = new FileOutputStream("D:/a.mp4");
                java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos)
        ) {
            byte[] bs = new byte[1024 * 4];
            int len;
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("缓冲流耗时:"+(t2-t1));
    }

    private static void norCopy() {
        long t1 = System.currentTimeMillis();
        try (
                final FileInputStream fis = new FileInputStream("D:\\课程文件\\day01\\视频\\13.入门程序.mp4");
                final FileOutputStream fos = new FileOutputStream("D:/b.mp4");
        ) {
            byte[] bs = new byte[1024 * 4];
            int len;
            while ((len = fis.read(bs)) != -1) {
                fos.write(bs,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long t2 = System.currentTimeMillis();
        System.out.println("普通流耗时:"+(t2-t1));
    }

}

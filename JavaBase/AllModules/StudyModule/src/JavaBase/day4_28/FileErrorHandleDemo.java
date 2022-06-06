package JavaBase.day4_28;


import java.io.*;

public class FileErrorHandleDemo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fos = new FileOutputStream("D:/a.txt");
            fis = new FileInputStream("D:/b.txt");
            byte[] bs = new byte[1024];
            int len;
            while ((len = fis.read(bs)) != -1) {
                fos.write(bs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {//如果是空值的话无法调用close
                    fos.close();
                    fos = null;//作用是释放fos所指向的对象的内存
                }
                if (fis != null) {
                    fis.close();
                    fis = null;//作用是释放fis所指向的对象的内存
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


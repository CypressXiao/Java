package JavaBase.day4_28;


import java.io.*;

public class FileCopyDemo3 {
    public static void main(String[] args) {
        //给出要读取的文件
        File srcDir = new File("C:\\Users\\Cypress_Xiao\\Desktop\\day01");
        //给出要复制到的位置
        File desDir = new File("D:");

        copyAllFile(srcDir, desDir);
    }

    //定义一个复制的静态方法
    public static void copyAllFile(File srcDir, File desDir) {
        //判断是否是文件夹,如果是文件夹,更新目的地文件夹
        if (srcDir.isDirectory()) {
            File newDesDir = new File(desDir, srcDir.getName());
            //如果文件夹不存在则创建其对应路径的文件夹
            if (!newDesDir.exists()) {
                newDesDir.mkdirs();
            }
            //递归文件夹进行判断
            File[] f = srcDir.listFiles();
            //遍历文件夹,并进行递归判断
            for (File file : f) {
                copyAllFile(file, newDesDir);
            }
        } else {
            copyFile(srcDir, desDir);
        }
    }

    //定义一个文件传输的方法
    public static void copyFile(File srcDir, File desDir) {
        //再目的路径中创建同名文件
        File newDesDir = new File(desDir, srcDir.getName());
        //创建输入流和输出流
        try (
                //传入file类型,再利用file可以和字符串自动拼接成新file的特性,规避String路径需要\\的问题
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcDir));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newDesDir));
        ) {
            byte[] bs = new byte[64*1024];
            int len;
            //先进行读取,再进行复制
            while ((len = bis.read(bs)) != -1) {
                bos.write(bs, 0, len);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package JavaBase.day4_28;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\a.txt",true);
            fos.write("胡冠雨是个大好人".getBytes());//有\n换行
            fos.write("胡冠雨".getBytes(),0,3);//GBK中一个中文对应2个字节,UTF-8中一个中文对应3个字节
            fos.write("牛逼".getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

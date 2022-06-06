package JavaBase.day4_28;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyDemo1 {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\b.avi",true);
                FileInputStream fis = new FileInputStream("D:\\课程文件\\day01\\视频\\2.自我介绍.mp4");
        ) {
           byte[] bs = new byte[1024];
           int len;
           while((len =fis.read(bs))!=-1){
               fos.write(bs,0,len);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

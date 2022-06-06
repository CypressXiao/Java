package JavaBase.day5_1;



import org.apache.commons.io.FileUtils;

import java.io.File;

public class IOUtilDemo1 {
    public static void main(String[] args) {
        try {
            long t1 = System.currentTimeMillis();
            FileUtils.copyDirectoryToDirectory(new File("D:\\课程文件"),new File("C:\\Users\\Cypress_Xiao\\Desktop"));
            long t2 =System.currentTimeMillis();
            System.out.println((t2-t1)/1000/60);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package JavaBase.day4_26;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File f1 =new File("C:/Users/Cypress_Xiao/Desktop/copy");//有名字相同的不能创建
        File f2= new File("C:/Users/Cypress_Xiao/Desktop/copy/a.text");
        System.out.println(f1.exists());
        System.out.println(f1.mkdirs());
        System.out.println(f2.createNewFile());
        f2.delete();

        System.out.println("---------------------------------------------------------");

        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.canExecute());
        System.out.println(f1.isHidden());
    }
}

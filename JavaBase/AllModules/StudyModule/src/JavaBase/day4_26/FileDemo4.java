package JavaBase.day4_26;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        String path ="C:\\Users\\Cypress_Xiao\\Desktop\\pictures";
        getFile(path);

    }
    public static void getFile(String path){
        File f = new File(path);
        if(f.isFile() && f.getName().toLowerCase().endsWith("jpg")){
            System.out.println(f);
        }else{
            File[] f1 =f.listFiles();
            if (f1 != null) {
                for (File file : f1) {
                    getFile(file.getAbsolutePath());
                }
            }
        }
    }
}

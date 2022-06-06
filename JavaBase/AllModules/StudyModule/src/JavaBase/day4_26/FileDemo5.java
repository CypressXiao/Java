package JavaBase.day4_26;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Cypress_Xiao\\Desktop\\pictures";
        getAllFile(path);
    }

    public static void getAllFile(String path) {
        File f = new File(path);
        /*if(f.isFile()){
            System.out.println(f);
        }else{
            File[] f1 = f.listFiles();
            if(f1 !=null){
                for (File file : f1) {
                    getAllFile(file.getAbsolutePath());
                }
            }
        }*/

        if (f.isDirectory()) {
            File[] f1 = f.listFiles();
            if (f1 != null) {
                for (File file : f1) {
                    getAllFile(file.getAbsolutePath());
                }
            }
        } else {
            System.out.println(f);
        }
    }
}

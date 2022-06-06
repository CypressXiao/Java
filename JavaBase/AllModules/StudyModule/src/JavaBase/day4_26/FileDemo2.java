package JavaBase.day4_26;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        String path = "C:/Users/Cypress_Xiao/Desktop/copy";
        deleteAll(path);//传入一个路径
    }

    public static void deleteAll(String path){
        //创建路径对应的文件
        File f = new File(path);
        /*//判断是不是文件
        if (!f.isFile()) {
            //是文件夹的话遍历文件夹中内容
            File[] f1 = f.listFiles();
            //判断是否是空文件夹
            if (f1 != null) {
                //递归删除
                for (File file : f1) {
                    deleteAll(file.getAbsolutePath());
                }
            }
        }
        //删除文件或空文件夹
        f.delete();*/
        if(f.isDirectory()){
            File[] f1 =f.listFiles();
            if(f1!=null){
                for (File file : f1) {
                    deleteAll(file.getAbsolutePath());
                }
            }
        }
        f.delete();
    }
}

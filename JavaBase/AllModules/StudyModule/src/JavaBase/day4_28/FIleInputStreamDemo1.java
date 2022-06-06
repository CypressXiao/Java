package JavaBase.day4_28;


import java.io.FileInputStream;

public class FIleInputStreamDemo1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\a.txt");
            byte[] bs = new byte[1024];
            int len;
            while((len =fis.read(bs))!=-1){
                System.out.println(new String(bs,0,len));
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


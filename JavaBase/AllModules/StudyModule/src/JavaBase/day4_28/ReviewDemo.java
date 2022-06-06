package JavaBase.day4_28;




import java.io.*;

//"C:\Users\Cypress_Xiao\Desktop\肖榆柏的总结.docx"
//"C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\a.txt",true
public class ReviewDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Cypress_Xiao\\Desktop\\肖榆柏的总结.txt");
            FileWriter fw = new FileWriter("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\c.txt");
            char[] ch = new char[3800];
            int len = fr.read(ch);
            fw.write(ch,0,len);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

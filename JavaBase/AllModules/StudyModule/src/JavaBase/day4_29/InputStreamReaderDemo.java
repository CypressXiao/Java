package JavaBase.day4_29;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try (
                final InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\in.txt"));
        ) {
            char[] ch = new char[1024];
            int len;
            while((len =isr.read(ch))!=-1){
                System.out.println(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

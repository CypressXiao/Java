package JavaBase.day4_29;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestDemo2 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\1.docx")));
        ) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

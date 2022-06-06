package JavaBase.day4_28;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        final Properties p = new Properties();
        try {
            p.load(new FileReader("conf\\config.properties"));
            System.out.println(p.getProperty("name"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

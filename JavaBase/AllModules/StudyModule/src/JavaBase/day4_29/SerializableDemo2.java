package JavaBase.day4_29;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo2 {
    public static void main(String[] args) {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\e.txt"));
        ) {
            Teacher t = new Teacher("胡冠雨",18,"男");
            oos.writeObject(t);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

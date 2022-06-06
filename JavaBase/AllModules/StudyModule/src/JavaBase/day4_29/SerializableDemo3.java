package JavaBase.day4_29;


import java.io.FileInputStream;

import java.io.ObjectInputStream;


public class SerializableDemo3 {
    public static void main(String[] args) {
        try (
                final ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\e.txt"));
        ) {
            Teacher t =(Teacher)ois.readObject();
            t.setAge(31);
            System.out.println(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

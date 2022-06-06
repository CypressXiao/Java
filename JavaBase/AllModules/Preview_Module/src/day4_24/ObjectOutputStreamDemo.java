package day4_24;

import java.io.*;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        Person p = new Person("Cypress", 25, "男");
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\i.text"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\i.text"))
        ) {
            oos.writeObject(p);
            System.out.println(ois.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    String name;
    int age;
    String gender;

    public Person() {

    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

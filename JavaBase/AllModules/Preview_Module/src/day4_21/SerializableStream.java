package day4_21;

import java.io.*;

public class SerializableStream {
    public static void main(String[] args) {
        Person p = new Person("张三",29,'男');

        try(
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\f.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\f.txt"))
            ) {
            oos.writeObject(p);
            System.out.println("序列化完成!");
            oos.close();
            Object o = ois.readObject();
            Person p1 =(Person) o;
            System.out.println(p1.gender);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



class Person implements Serializable {
    String name;
    int age;
    char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
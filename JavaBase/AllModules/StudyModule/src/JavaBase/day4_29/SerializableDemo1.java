package JavaBase.day4_29;


import java.io.*;

public class SerializableDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\c.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\c.txt"));
                ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\d.txt"));
        ) {
            Person1 p = new Person1("张三", 18, "男");
            Person1 p1 = new Person1("李四",19,"女");
            Person1 p2 = new Person1("王五",50,"不详");

            oos.writeObject(p);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();
            Person1 o;
            while((o =(Person1) ois.readObject())!=null){
                oos1.writeObject(o);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person1 implements Serializable {
    String name;
    transient int age;
    String gender;

    public Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

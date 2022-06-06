package day4_21;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class SerializableTest {
    public static void main(String[] args) {
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("张三",29,'男'));
        map.put(2,new Person("李四",36,'女'));
        map.put(3,new Person("王五",42,'男'));
        map.put(4,new Person("Cypress",25,'男'));

        try(
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\g.txt"));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\test\\g.txt"))
            ) {
            oos.writeObject(map);
            oos.flush();
            oos.close();

            Object o = ois.readObject();
            Map<Integer,Person> map1 =(Map<Integer,Person>) o;
            System.out.println(map.size());
            map1.forEach((K,V)->System.out.println(K+","+V));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

package JavaBase.day5_2;

import day3_30.Person;

import java.util.ArrayList;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo2 {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<>();
        Person1 p1 = new Person1("张三", "男", 20);
        Person1 p2 = new Person1("李四", "男", 17);
        Person1 p3 = new Person1("王五", "女", 23);
        Person1 p4 = new Person1("赵六", "男", 30);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Person1 person = getPerson(() -> {
            Person1 person1 = null;
            for (Person1 p : list) {
                if (p.name.equals("张三")) {
                    person1 = p;
                    break;
                }
            }
            return person1;
        });

        System.out.println(person);

    }

    public static Person1 getPerson(Supplier<Person1> s){
        return s.get();
    }
}

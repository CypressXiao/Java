package JavaBase.day5_2;

import day3_30.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda3 {
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

        list.sort((o1,o2)->o2.age-o1.age);
        System.out.println(list);

        Integer[] arr ={1,23,4,25,53,2,99};

        Arrays.sort(arr,(o1,o2)->(o2 - o1));
        System.out.println(Arrays.toString(arr));
    }
}

class Person1{
    String name;
    String gender;
    int age;

    public Person1(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

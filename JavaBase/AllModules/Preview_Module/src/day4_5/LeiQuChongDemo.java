package day4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeiQuChongDemo {
    public static void main(String[] args) {
        List<Person4> list =new ArrayList<>();
        list.add(new Person4("张三",21,'男'));
        list.add(new Person4("李四",22,'女'));
        list.add(new Person4("张三",21,'男'));
        list.add(new Person4("李四",22,'女'));
        list.add(new Person4("张三",21,'男'));

        List<Person4> list1 =distinct(list);
        System.out.println(list1);
    }

    public static List<Person4> distinct(List<Person4> list){
        List<Person4> list1 = new ArrayList<>();
        for (Person4 person4 : list) {
            if (!list1.contains(person4)) {
                list1.add(person4);
            }
        }
        return list1;
    }
}

class Person4{
    private String name;
    private int age;
    private char gender;
    public Person4(){

    }

    public Person4(String name,int age,char gender){
        this.name =name;
        this.age = age;
        this.gender =gender;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person4)) return false;
        Person4 person4 = (Person4) o;
        return age == person4.age &&
                gender == person4.gender &&
                Objects.equals(name, person4.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}

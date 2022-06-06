package day4_8;

import java.util.ArrayList;
import java.util.Collections;

public class CompareDemo1 {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<>();
        list.add(new Person1("Jordan",51));
        list.add(new Person1("Kobe",43));
        list.add(new Person1("James",37));

        Collections.sort(list);
        System.out.println(list);
    }
}

class Person1 implements Comparable<Person1>{
    private String name;
    private int age;

    public Person1(){

    }

    public Person1(String name,int age){
        this.name = name;
        this.age =age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "姓名:" + name  +
                ", 年龄:" + age +
                '}';
    }

    @Override
    public int compareTo(Person1 o) {
        return o.name.compareTo(this.name);
    }
}
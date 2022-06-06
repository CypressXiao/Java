package day4_5;

import java.util.ArrayList;
import java.util.List;

public class ForeachDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int numb : arr) {
            System.out.println(numb);
        }
        System.out.println("--------------------");

        List<Person5> list = new ArrayList<>();
        list.add(new Person5("张三",18,'男'));
        list.add(new Person5("李四",19,'男'));
        list.add(new Person5("王五",18,'女'));
        for(Person5 person:list){
            System.out.println(person);
        }
    }
}

class Person5 {
    private String name;
    private int age;
    private char gender;
    public Person5(){

    }

    @Override
    public String toString() {
        return "Person5{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person5(String name, int age, char gender){
        this.name =name;
        this.age =age;
        this.gender=gender;
    }
}

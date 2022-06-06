package JavaBase.day4_20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18));
        list.add(new Student("李四", 18));
        list.add(new Student("王五", 30));
        list.add(new Student("Cypress", 25));

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Student> list2 = new ArrayList<>(list);
        list2.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age;
            }
        });
        System.out.println(list2);

    }
}

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age == o.age){
            return o.name.compareTo(this.name);
        }
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

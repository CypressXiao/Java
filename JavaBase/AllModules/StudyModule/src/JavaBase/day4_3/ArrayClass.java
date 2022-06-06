package JavaBase.day4_3;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        Student[] stus = new Student[1];

        Student s1 = new Student("张三", 23);

        stus[0] = s1;
        String str = s1.toString();
        System.out.println(str);
        System.out.println(Arrays.toString(stus));


        Person[] pers = new Person[1];

        pers[0] = s1;
    }
}


interface Person {


}

class Student implements Person {

    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


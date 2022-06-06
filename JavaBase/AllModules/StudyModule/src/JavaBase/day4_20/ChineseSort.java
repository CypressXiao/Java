package JavaBase.day4_20;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;

public class ChineseSort {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("张三",28));
        list.add(new Student1("李四",20));
        list.add(new Student1("王五",25));

        list.sort(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                Collator collator = Collator.getInstance(Locale.CHINA);
                return collator.compare(o1.name,o2.name);
            }
        });
        System.out.println(list);
    }
}


class Student1{
    String name;
    int age;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
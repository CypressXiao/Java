package day4_8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Teachers> set = new TreeSet<>();
        set.add(new Teachers("张三",35,"男"));
        set.add(new Teachers("李四",29,"男"));
        set.add(new Teachers("王五",32,"女"));
        System.out.println(set);

        Set<Teachers> set1 = new TreeSet<>(new Comparator<Teachers>() {
            @Override
            public int compare(Teachers o1, Teachers o2) {
                return o1.age -o2.age;
            }
        });
        set1.add(new Teachers("张三",35,"男"));
        set1.add(new Teachers("李四",29,"男"));
        set1.add(new Teachers("王五",32,"女"));
        System.out.println(set1);
    }
}

class Teachers implements Comparable<Teachers>{
    String name;
    int age;
    String gender;

    public Teachers() {
    }

    public Teachers(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Teachers o) {
        return o.age - this.age;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

package JavaBase.day4_20;

import java.text.Collator;
import java.util.*;

public class TreeDemo1 {
    public static void main(String[] args) {
        TreeSet<Person1> t = new TreeSet<>(new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                Collator co = Collator.getInstance(Locale.CHINA);//若不加则是默认语言环境
                int i = co.compare(o1.getName(), o2.getName());
                return i == 0 ? o2.getAge() - o1.getAge() : i;
            }//去重不用重写equals和hashcode了!!!!!
        });
        t.add(new Person1("张三", 24));
        t.add(new Person1("张三", 24));
        t.add(new Person1("李四", 25));
        t.add(new Person1("王五", 28));
        t.add(new Person1("王五", 30));

        System.out.println(t);
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person1)) return false;
        Person1 person1 = (Person1) o;
        return age == person1.age &&
                Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}


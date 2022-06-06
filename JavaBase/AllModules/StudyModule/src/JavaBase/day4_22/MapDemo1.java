package JavaBase.day4_22;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("张三",20,"男"),"北京人");
        map.put(new Person("李四",21,"女"),"曹县人");
        map.put(new Person("王五",22,"男"),"上海人");
        map.put(new Person("张三",20,"男"),"北京人");

        //通过键值对遍历
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person, String> person : set) {
            System.out.println(person.getKey()+"="+person.getValue());
        }

        //通过键值遍历
        Set<Person> set1 =map.keySet();
        for (Person person : set1) {
            System.out.println(person+"="+map.get(person));
        }

        //遍历value
        Collection<String> col = map.values();
        for (String s : col) {
            System.out.println(s);
        }
    }
}

class Person{
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getGender());
    }
}

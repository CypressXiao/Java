package day4_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("张三",18,'男'));
        set.add(new Person("李四",19,'女'));
        set.add(new Person("张三",18,'男'));

        Object[] o = set.toArray();
        for (Object o1 : o) {
            System.out.println(o1);
        }
        System.out.println("----------------------");

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------");

        for(Person person:set){
            System.out.println(person);
        }

    }
}

class Person{
    private String name;
    private int age;
    private char gender;
    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                gender == person.gender &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    public Person(String name, int age, char gender){
        this.name =name;
        this.age =age;
        this.gender =gender;
    }

}

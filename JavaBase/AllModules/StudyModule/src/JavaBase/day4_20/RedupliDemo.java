package JavaBase.day4_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class RedupliDemo {
    public static void main(String[] args) {
        ArrayList<Person2> list = new ArrayList<>();
        list.add(new Person2("张三",23));
        list.add(new Person2("李四",25));
        list.add(new Person2("张三",23));
        list.add(new Person2("王五",30));
        list.add(new Person2("Cypress",35));

        //常规去重方式,选择排序法
        /*for(int i=0;i<list.size()-1;i++){
            for(int j =i+1;j<list.size();j++){
                if(list.get(i).name.equals(list.get(j).name) && list.get(i).age == list.get(j).age){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);*/

        //用contains去重
        /*ArrayList<Person2> list1 = new ArrayList<>();
        for (Person2 p : list) {
            if(!list1.contains(p)){
                list1.add(p);
            }
        }
        System.out.println(list1);*/

        //用set去重
        HashSet<Person2> set = new HashSet<>(list);
        System.out.println(set);
    }
}


class Person2{
    String name;
    int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person2)) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age &&
                Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

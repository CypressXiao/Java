package day4_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {

    public static void main(String[] args) {
        List<Person1> list =new ArrayList<>();
        list.add(new Person1("小明",21,'男'));
        list.add(new Person1("小王",22,'男'));
        list.add(new Person1("小赵",23,'女'));
        list.add(new Person1("小红",24,'女'));

        //toArray()
        Object[] o1 = list.toArray();
        for(Object i:o1){
            System.out.println(i);
        }
        System.out.println("-------------------------------------");

        //for循环遍历打印
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------------------");

        ListIterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------------------------");

        Iterator it1 =list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("-------------------------------------");


    }
}

class Person1{
    private String name;
    private int age;
    private char gender;

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public  Person1(){

    }//任何时候构造方法都需要弄一个无参的

    public Person1(String name, int age, char gender){
        this.name =name;
        this.age =age;
        this.gender =gender;
    }
}


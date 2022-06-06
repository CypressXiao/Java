package day4_5;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        String str = "张三,18,男;李四,39,女;王五,36,男";
        List<Person3> list = new ArrayList<>();
        String[] arr = str.split(";");
        for(String i:arr){
            String[] arr2 =i.split(",");
            list.add(new Person3(arr2[0],Integer.valueOf(arr2[1]),arr2[2].charAt(0)));
        }
        System.out.println(list);

    }
}

class Person3{
    private String name;
    private Integer age;
    private char gender;

    public Person3(){

    }

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person3(String name, Integer age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

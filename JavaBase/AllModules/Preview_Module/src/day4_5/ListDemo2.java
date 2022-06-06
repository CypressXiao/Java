package day4_5;

import java.util.ArrayList;
import java.util.List;

//String str = "张三,18,男;李四,39,女;王五,36,男"把这个字符串中分离出的三个Person对象存入一个集合中
public class ListDemo2 {
    public static void main(String[] args) {
        String str = "张三,18,男;李四,39,女;王五,36,男";
        List<Person2> list = new ArrayList<>();
        String[] arr = str.split(";");
        for(int i=0;i<arr.length;i++){
            String[] arr2 =arr[i].split(",");
            list.add(new Person2(arr2[0],arr2[1],arr[2]));
        }
        System.out.println(list);

    }
}

class Person2{
    private String name;
    private String age;
    private String gender;

    public Person2(){

    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person2(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

package day4_4;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<Student3>();

        Student3 s1 = new Student3();
        s1.name ="小明";
        s1.age =21;

        Student3 s2 =new Student3();
        s2.name ="小王";
        s2.age =26;

        Student3 s3 = new Student3();
        s3.name ="小肖";
        s3.age = 25;

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i).studentInfo(list.get(i)));
        }

    }
}

class Student3{
    String name;
    int age;

    public String studentInfo(Student3 s){
        return "["+s.name+","+s.age+"]";
    }
}


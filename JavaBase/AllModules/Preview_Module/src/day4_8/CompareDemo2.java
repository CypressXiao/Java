package day4_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDemo2 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        list.add(new Student1("张三",20,95));
        list.add(new Student1("李三",18,97));
        list.add(new Student1("赵三",21,99.2));
        list.add(new Student1("王三",21,99));

        Collections.sort(list);
        System.out.println(list);
        System.out.println("-------------------------------------");

        Collections.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                //如果是类的引用数据类型则在类中的成员变量不要私有化
                if(o1.age ==o2.age){
                    return o1.score -o2.score>0?1:-1;
                }
                return o2.age-o1.age;
            }
        });
        System.out.println(list);
    }
}

class Student1 implements Comparable<Student1>{
    String name;
    int age;
    double score;

    public Student1() {
    }

    public Student1(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(Student1 o) {
        if(this.age == o.age){
            if((this.score -o.score)>0){
                return -1;
            }else{
                return 1;
            }
        }else{
            return this.age -o.age;
        }
    }
}




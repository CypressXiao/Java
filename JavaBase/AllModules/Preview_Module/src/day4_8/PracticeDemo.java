package day4_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级学生人数:");
        int numb = sc.nextInt();
        ArrayList<Student> list = getInfo(numb);
        System.out.println(list);
        System.out.println("-----------------------------------");
        Collections.sort(list);
    }
    
    public static ArrayList<Student> getInfo(int numb){
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<numb;i++) {
            System.out.println("请输入第"+(i+1)+"位学生的姓名:");
            String name =sc.next();
            System.out.println("请输入第"+(i+1)+"位学生的性别:");
            String gender =sc.next();
            System.out.println("请输入第"+(i+1)+"位学生的分数:");
            double score =sc.nextDouble();
            Student s = new Student(name,gender,score);
            list.add(s);
        }
        return list;
    }
}

class Student implements Comparable<Student>{
    private String name;
    private String gender;
    private double score;

    public Student() {
        
    }

    public Student(String name, String gender, double score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名:" + name  +
                ", 性别:" + gender +
                ", 分数:" + score +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return (int)(this.score - o.score);
    }
}

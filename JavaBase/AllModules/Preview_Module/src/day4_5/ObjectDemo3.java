package day4_5;

import java.util.Objects;

public class ObjectDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("小明",21,89);
        System.out.println(s1.toString());
        Student s2 =new Student("小红",26,99);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        Student s3 = s2;
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
    }
}

class Student{
    private String name;
    private int age;
    private int score;
    public Student(String name,int age,int score){
        this.name =name;
        this.age =age;
        this.score =score;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                score == student.score &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}

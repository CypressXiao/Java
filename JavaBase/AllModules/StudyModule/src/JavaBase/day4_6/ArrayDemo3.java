package JavaBase.day4_6;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * 全班同学中随机的找出一名同学，打印这名同学的个人信息。
 * 我们对本案例进行分析，得出如下分析结果：
 * 1.存储全班同学信息（姓名、年龄）
 * 2.打印全班同学每一个人的信息（姓名、年龄）
 * 3.在班级总人数范围内，随机产生一个随机数，查找该随机数所对应的同学信息（姓名、年龄）
 * 随机点名器明确地分为了三个功能。如果将多个独立功能的代码写到一起，则代码相对冗长，我们可以针对不同的功能
 * 可以将其封装到一个方法中，将完整独立的功能分离出来。
 * 而在存储同学姓名时，如果对每一个同学都定义一个变量进行姓名存储，则会出现过多孤立的变量，
 * 很难一次性将全部数据持有。此时，我们采用ArrayList集合来解决多个学生信息的存储问题。
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        ArrayList<Student1> l2 = new ArrayList<>();
        //添加学生并打印所有学生
        addStu(l2);
        System.out.println("-------------------------------------");
        int numb =getRan(l2);
        Student1 s = l2.get(numb);
        System.out.println("被点名的学生姓名为:"+s.name+",年龄为:"+s.age+",分数为:"+s.score);



    }


    public static void addStu(ArrayList<Student1> l1){

        System.out.println("请输入班级人数:");
        Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        for(int i=0;i<numb1;i++){
            Student1 s = new Student1();
            System.out.println("请输入第"+(i+1)+"个同学的姓名:");
            String name =sc.next();
            System.out.println("请输入第"+(i+1)+"个同学的年龄:");
            int age =sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个同学的分数:");
            double score =sc.nextDouble();
            System.out.println("---------------------------");
            s.name =name;
            s.age =age;
            s.score =score;
            l1.add(s);
        }
        System.out.println(l1);
    }

    public static Integer getRan(ArrayList<Student1> a){

        Random ran =new Random();
        int ran1 = ran.nextInt(a.size());
        return ran1;
    }
}



class Student1{
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student1)) return false;
        Student1 student1 = (Student1) o;
        return age == student1.age &&
                Double.compare(student1.score, score) == 0 &&
                Objects.equals(name, student1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }

    int age;
    double score;

    @Override
    public String toString() {
        return "Student1{" +
                "姓名:'" + name  +
                ", 年龄:" + age +
                ", 分数:" + score +
                '}';
    }
}

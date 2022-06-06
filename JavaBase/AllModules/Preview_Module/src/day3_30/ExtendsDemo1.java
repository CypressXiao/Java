package day3_30;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        Person1 p =new Person1();
        p.grade = 98.5;
        System.out.println(p.grade);
        Teachers t =new Teachers();
        t.grade =100;
        System.out.println(t.grade);
    }
}

//继承 private修饰的无法被继承
class Person1 extends Student{
    String name;
    double height;
    int age;
}
// 多层继承
class Teachers extends Person1{
    double salary;
}

class Student{
    double grade;
}
package day3_31;

public class DuoTaiDemo {
    public static void main(String[] args) {
    Teacher t = new Student();
        System.out.println(t.name);//张宇
        System.out.println(t.age);//40
        /*System.out.println(s.gender);//报错
        Teacher.sleep();//报错*/
        t.teach();//张老师教的数学
        t.eat();//吃泡面
        Teacher.learn();//张老师在学英语
    Student s =(Student) t;
        System.out.println(s.gender);
        s.sleep();
    }
}

class Teacher{
    String name = "张宇";
    int age = 40;
    public void teach(){
        System.out.println("张老师教的数学!");
    }
    public void eat(){
        System.out.println("张老师在吃饭!");
    }
    public static void learn(){
        System.out.println("张老师在学英语!");
    }
}

class Student extends Teacher{
    String name ="Cypress";
    String gender ="男";
    public void eat(){
        System.out.println("吃泡面!");
    }
    public void sleep(){
        System.out.println("睡了几天了!");
    }
    public static void learn(){
        System.out.println("在学习计算机!");
    }
}
package day4_4;


/**
 * 1.建立InstanceTest 类，在类中定义方法method(Person e);
 * 在method中:
 * (1)根据e的类型调用相应类的getInfo()方法。
 * (2)根据e的类型执行：
 * 如果e为Person类的对象，输出：
 * “a person”;
 * 如果e为Student类的对象，输出：
 * “a student”
 * “a person ”
 * 如果e为Graduate类的对象，输出：
 * “a graduated student”
 * “a student”
 * “a person”
 *
 */
public class DuoTaiCase1 {
    public static void main(String[] args) {
        method(new Person1());
        System.out.println("-----------");
        method(new Student());
        System.out.println("-----------");
        method(new Graduate());
    }

    public static void method(Person1 e){
        e.getInfo();
    }
}

class Person1{
    public void getInfo(){
        System.out.println("a person");
    };
}

class Student extends Person1{
    public void getInfo(){
        System.out.println("a student");
        System.out.println("a person");
    }
}

class Graduate extends  Person1{
    public void getInfo(){
        System.out.println("a graduated student");
        System.out.println("a student");
        System.out.println("a person");
    }
}

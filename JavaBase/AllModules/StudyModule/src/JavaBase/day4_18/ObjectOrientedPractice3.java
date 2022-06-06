package JavaBase.day4_18;

public class ObjectOrientedPractice3 {
    public static void main(String[] args) {
        Person p1 = new Person("Cypress",25);
        Person p2 = new Person("Ed",26);
        p1.show();
        p2.show();
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(){
        System.out.println("姓名:"+name+",年龄:"+age);
    }
}

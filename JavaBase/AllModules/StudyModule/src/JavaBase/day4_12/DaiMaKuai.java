package JavaBase.day4_12;

public class DaiMaKuai {
    public static void main(String[] args) {
        Person p1 = new Person("xiaoyubai",25);
        System.out.println(p1.name +","+p1.age);

        Person p2 = new Person();
        p2.name ="Ed";
        System.out.println(p2.name +","+p2.age);
    }

}

class Person{
    String name;
    int age;
    {
        this.name = "Cypress";
        this.age = 21;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
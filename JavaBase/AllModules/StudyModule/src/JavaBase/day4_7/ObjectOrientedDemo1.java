package JavaBase.day4_7;

public class ObjectOrientedDemo1 {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.name ="中华田野犬";
        dog.age =5;
        dog.gender ="雄";
        dog.color ="白色";

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.gender);
        System.out.println(dog.color);

        dog.eat();
        dog.sleep();
        dog.sleep();
        System.out.println("-----------------------------");

        Dog dog1 =new Dog();
        dog1.name ="哈士奇";
        dog1.age =6;
        dog1.gender ="雌";
        dog1.color ="黑色";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1.color);

        dog.eat();
        dog.sleep();
        dog.sleep();
        System.out.println("-----------------------------");
    }

}

class Dog{
    String name;
    int age;
    String gender;
    String color;


    public void eat(){
        System.out.println(name +"吃骨头!");
    }
    public void sleep(){
        System.out.println(name+"趴着睡!");
    }
    public void shout(){
        System.out.println(name+"汪汪的叫!");
    }
}


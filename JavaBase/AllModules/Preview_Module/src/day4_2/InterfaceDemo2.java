package day4_2;;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        Animal1 a1 = new Cat1();
        a1.name = "小花";
        a1.speak();
        Pet p = new Cat1();
        p.eat();
    }
}

abstract class Animal1 {
    String name;

    abstract public void speak();

    public Animal1() {
    }

}

interface Pet {
    abstract public void eat();
}

class Cat1 extends Animal1 implements Pet {
    public void speak() {
        System.out.println("miao,my name is " + name);
    }

    public void eat() {
        System.out.println("I want to eat some fish!");
    }
}
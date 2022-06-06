package JavaBase.day4_18;

public class InheritDemo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "大黄";
        dog.eat();
    }
}

class Animal{
    String name;
    String furColor;
    int age;

    public Animal(){ }

    public Animal(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public void eat(){
        System.out.println("动物是"+name);
    }
}

class Dog extends Animal{
    String gender;

    public Dog(){}

    public Dog(String gender) {
        this.gender = gender;
    }

    public Dog(String name, String furColor, int age, String gender) {
        super(name, furColor, age);
        this.gender = gender;
    }

    public void eat(){
        super.eat();
        System.out.println(name+"爱吃骨头!");
    }
}
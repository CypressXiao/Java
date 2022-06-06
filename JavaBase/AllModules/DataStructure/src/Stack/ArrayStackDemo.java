package Stack;

public class ArrayStackDemo {
    public static void main(String[] args) {
       Animal ani = new Dog();

    }
}


class Animal{
    String name;
    int age;
    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗啃骨头!");
    }
}




/**
 * 中缀表达式转后缀表达式方式:
 */


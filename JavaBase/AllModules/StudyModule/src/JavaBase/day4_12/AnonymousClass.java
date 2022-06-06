package JavaBase.day4_12;

public class AnonymousClass {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        new Animal(){
            @Override
            public void eat() {
                System.out.println("猫吃鱼!");
            }
        }.eat();

        Animal b =new Animal(){
            @Override
            public void eat() {
                System.out.println("羊吃草!");
            }
        };
        b.eat();
    }

}

class Animal{
    public void eat(){
        System.out.println("动物吃饭!");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头!");
    }
}


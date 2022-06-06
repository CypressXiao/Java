package day4_2;;

public class DuoTaiPractice1 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Lady l =new Lady("张女士",a1);
        a1.name ="小花";
        Cat c =(Cat) a1;
        c.eyesColor ="红色";
        System.out.println(l.name+"有一个眼睛是"+c.eyesColor+"的,名字叫"+a1.name+"的猫");

        Animal a2 = new Dog();
        Lady l2 =new Lady("王女士",a2);
        a2.name ="小白";
        Dog d =(Dog)a2;
        d.furcolor ="绿色";
        System.out.println(l2.name+"有一个皮毛颜色是"+d.furcolor+"的,名字叫"+a2.name+"的狗");
    }
}

abstract class Animal{
    String name;
    public Animal() {

    }
    public Animal(String name){
        this.name =name;
    }
    abstract public String enjoy();
}

class Cat extends Animal{
    String eyesColor;
    public String enjoy(){
        return "喵喵喵";

    }
}

class Dog extends  Animal{
    String furcolor;
    public String enjoy(){
        return "汪汪汪";
    }
}

class Lady{
    String name;
    Animal pet;

    public Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public Lady() {
    }

    public String myPetEnjoy(Animal a){
        return a.enjoy();
    }
}


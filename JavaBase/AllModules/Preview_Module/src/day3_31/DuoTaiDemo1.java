package day3_31;

public class DuoTaiDemo1 {
    public static void main(String[] args) {
    /*Cat1 c = new Cat1();
    makeAnimalCry(c);
    makeAnimalCry(new Dog());
    makeAnimalCry(new Goat());*/
        Animal1 a =new Cat1();
        a.cry();
        Animal1 b =new Dog();
        b.cry();
        Animal1 c =new Goat();
        c.cry();



    }
    //这个静态方法是为了简化而封装的方法
    public static void makeAnimalCry(Animal1 a) {
        a.cry();
    }
}

class Animal1{
    public void cry(){

    }
}



class Cat1 extends Animal1{
    public void cry(){
        System.out.println("喵");
    }
}

class Dog extends Animal1{
    public void cry(){
        System.out.println("汪");
    }
}

class Goat extends Animal1{
    public void cry(){
        System.out.println("咩");
    }
}

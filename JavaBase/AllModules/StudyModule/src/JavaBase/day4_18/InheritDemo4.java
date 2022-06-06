package JavaBase.day4_18;

/**
 * 有一个Lady类,有两个宠物,一个猫,一个狗
 *  Lady有两个方法,一个是逗猫玩,一个是遛狗
 *
 *  猫是白色的,叫做tom
 *  狗是灰色的,叫做jerry
 *
 *  如果Lady逗猫玩的时候,猫会发出老吴老吴的叫声
 *  如果Lady遛狗的时候,狗会高兴地发出嗷嗷嗷的叫声
 *
 *  请设计程序,完成上面的功能
 */
public class InheritDemo4 {
    public static void main(String[] args) {
        Cat1 cat = new Cat1();
        cat.name ="Jerry";
        cat.furColor ="黄色";

        Dog2 dog = new Dog2();
        dog.name ="Tom";
        dog.furColor ="黑色";

        Lady1 lady = new Lady1();
        lady.cat = cat;
        lady.dog =dog;
        lady.playCat();
        lady.playDog();
    }
}

class Lady1{
    Cat1 cat;
    Dog2 dog;

    public Lady1() {
    }

    public Lady1(Cat1 cat, Dog2 dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void playDog(){
        System.out.println(dog.name+"高兴地发出嗷嗷嗷的叫声");
    }
    public void playCat(){
        System.out.println(cat.name+"发出老吴老吴的叫声");
    }
}

class Animal2{
    String name;
    String furColor;

    public Animal2() {
    }

    public Animal2(String name, String furColor) {
        this.name = name;
        this.furColor = furColor;
    }
}

class Cat1 extends Animal2{
    public Cat1() {
    }

    public Cat1(String name, String furColor) {
        super(name, furColor);
    }
}

class Dog2 extends Animal2{
    public Dog2() {
    }

    public Dog2(String name, String furColor) {
        super(name, furColor);
    }
}
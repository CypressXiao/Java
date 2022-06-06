package JavaBase.day4_18;

/**
 * 有一个Lady类,有两个宠物,一个猫,一个狗
 * Lady有两个方法,一个是逗猫玩,一个是遛狗
 *
 * 猫是白色的,叫做tom
 * 狗是灰色的,叫做jerry
 *
 * 如果Lady逗猫玩的时候,猫会发出老吴老吴的叫声
 * 如果Lady遛狗的时候,狗会高兴地发出嗷嗷嗷的叫声
 *
 * 请设计程序,完成上面的功能
 */
public class InheritDemo3 {
    public static void main(String[] args) {
       Lady l1 = new Lady(new Cat("Tom","黑色"),new Dog1("Jerry","白色"));
        l1.playCat();
        l1.playDog();
    }
}

class Lady{
    Cat cat;
    Dog1 dog;

    public Lady() {
    }

    public Lady(Cat cat, Dog1 dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void playCat(){
        cat.shout();
    }
    public void playDog(){
        dog.shout();
    }

}

abstract class Animal1{
    String name;
    String furColor;

    public Animal1() {
    }

    public Animal1(String name, String furColor) {
        this.name = name;
        this.furColor = furColor;
    }

    abstract public void shout();
}

class Dog1 extends Animal1{
    public Dog1() {
    }

    public Dog1(String name, String furColor) {
        super(name, furColor);
    }

    @Override
    public void shout() {
        System.out.println(name+"发出老吴老吴的叫声");
    }


}

class Cat extends Animal1{

    public Cat(String name, String furColor) {
        super(name, furColor);
    }

    @Override
    public void shout() {
        System.out.println(name+"高兴地发出嗷嗷嗷的叫声");
    }
}

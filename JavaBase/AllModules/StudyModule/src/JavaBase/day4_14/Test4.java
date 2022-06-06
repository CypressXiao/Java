package JavaBase.day4_14;

/**
 * 4.有一个Lady类,有名字和年龄,不需要私有化,还有两个宠物,一个猫,一个狗,猫和狗出生就会叫,
 *     后来经过Lady的训练,猫和狗都学会了自己的特有的技能,猫学会了钻火圈,狗学会了算术,
 *     Lady类中有一个训练猫和狗技能的方法,给该方法传入对应的动物,该方法就能查看每个动物学会的技能,
 *     请使用面向对象的思想将以上程序设计出来,并使用Lady对象调用方法,分别执行猫和狗的学会的技能.
 */
public class Test4 {
    public static void main(String[] args) {
        Lady lady = new Lady();
        lady.train(new Dog());

    }
}

class Lady{
    String name;
    int age;
    Pet1 pet;

    public Lady() {
    }

    public void train(Pet1 pet){
        pet.learn();
    }

}

abstract class Pet1{
    public abstract void shout();
    public abstract void learn();

}




class Dog extends Pet1 {

    @Override
    public void shout() {
        System.out.println("狗会叫!");
    }

    @Override
    public void learn() {
        System.out.println("狗学会算术!");
    }
}

class Cat extends Pet1 {



    @Override
    public void shout() {
        System.out.println("猫会叫!");
    }

    @Override
    public void learn() {
        System.out.println("猫学会钻火圈!");
    }
}
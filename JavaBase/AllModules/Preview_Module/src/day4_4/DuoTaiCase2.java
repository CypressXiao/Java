package day4_4;

/**
 编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。
 可以弹奏的乐器包括二胡、钢琴和琵琶。
 实现思路及关键代码：
 1)定义乐器类Instrument，包括方法makeSound()
 2)定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin
 3)定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
 4)定义测试类，给乐手不同的乐器让他弹奏
*/
public class DuoTaiCase2 {
    public static void main(String[] args) {
        System.out.println(new Musician().play(new Erhu()));
        String result = new Musician().play(new Piano());
        System.out.println(result);
        System.out.println(new Musician().play(new Violin()));
    }
}

class Musician{
    public String play(Instrument i){
        return i.makeSound();
    }
}


abstract class Instrument{
    abstract public String makeSound();
}

class Erhu extends Instrument{
    public String makeSound(){
         return "二胡二胡真厉害!";
    }
}

class Piano extends Instrument{
    public String makeSound(){
        return "刚琴钢琴真优雅!";
    }
}

class Violin extends Instrument{
    public String makeSound(){
        return "小提琴小提琴真美妙!";
    }
}
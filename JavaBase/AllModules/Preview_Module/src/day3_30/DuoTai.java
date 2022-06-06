package day3_30;

public class DuoTai {
    public static void main(String[] args) {
        Animal am =new Cat();
        am.eat();//猫在吃饭
        am.sleep();//动物在睡觉
        am.run();//动物在奔跑
        System.out.println(am.num);//10
        System.out.println(am.age);//20
       /* am.catchMouse;//报错
        System.out.println(am.name);//报错*/
        Cat ct =(Cat) am;
        ct.sleep();//猫在睡觉
        ct.run();//动物在奔跑
    }
}

class Animal{
    int num =10;
    static  int age = 20;
    public void eat(){
        System.out.println("动物在吃饭");
    }
    public  static void sleep(){
        System.out.println("动物在睡觉");
    }
    public void run(){
        System.out.println("动物在奔跑");
    }
}

class Cat extends Animal{
    int num = 80;
    static int age = 90;
    String name ="TomCat";
    public  void eat(){
        System.out.println("猫在吃饭");
    }
    public static void sleep(){
        System.out.println("猫在睡觉");
    }
    public  void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

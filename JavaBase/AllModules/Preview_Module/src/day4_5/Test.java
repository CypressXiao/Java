package day4_5;

public class Test {
    public static void main(String[] args) {
        Animal a =new Animal("羊") {
            @Override
            public String sound() {
                return "咩咩咩";
            }
        };//匿名内部类
        System.out.println(a.name+"的叫声为:"+a.sound());
    }
}

abstract class Animal{
    public String name;
    abstract public String sound();
    public Animal(){

    }

    public Animal(String name){
        this.name =name;
    }//构造方法为成员变量传值
}



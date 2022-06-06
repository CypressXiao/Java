package day4_2;;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        InterB i1 = new TestDemo();
        i1.way2();
    }
}


interface InterA{
    public static final int a = 100;
    public abstract void way1();
}

interface InterB extends  InterA{
    void way2();
}

class Test{}

class TestDemo extends Test implements InterB{
    public void way1(){
        System.out.println("上海抗疫");
    }
    public void way2(){
        System.out.println("加油!");
    }
}
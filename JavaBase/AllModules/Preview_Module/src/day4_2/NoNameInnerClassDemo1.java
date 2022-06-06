package day4_2;;

public class NoNameInnerClassDemo1 {
    public static void main(String[] args) {
        InterA1 a = new A1();
        input(a);
        input(new InterA1() {
            @Override
            public void eat() {
                System.out.println("今晚吃猪肉吧!");
            }
        });

    }
    public static void input(InterA1 a){
        a.eat();
    }
}

interface InterA1{
    abstract public void eat();
}

interface InterA2{
    void study();
}

class A1 implements InterA1{
    @Override
    public void eat() {
        System.out.println("今晚吃鸡吧!");
    }
}

package day4_2;;

public class NoNameInnerClass {
    public static void main(String[] args) {
        new InterC(){
            @Override
            public void eat() {
                System.out.println("人是铁,饭是钢,一顿不吃饿得慌");
            }
        }.eat();

        AbsClass ac =new AbsClass() {
            @Override
            public void sleep() {
                System.out.println("睡觉是保持高效工作的重要方式之一");
            }
        };
        ac.sleep();

        new NormalClass(){
            public void run(){
                System.out.println("读万卷书不如行万里路!");
            }
        }.run();
    }
}

interface InterC{
    abstract public void eat();
}

abstract class AbsClass{
    abstract public void sleep();
}

class NormalClass{
    public void run(){
        System.out.println("千里之行始于足下");
    }
}

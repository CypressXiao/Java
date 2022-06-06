package day3_30;

//饿汉式单例设计
public class Singleton1 {
    private static Singleton1 s = new Singleton1();
    private Singleton1() {
    }
    public static Singleton1 getInstance(){
        return s;
    }
}

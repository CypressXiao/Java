package JavaBase.day4_25;

public class Test3 {
    public static void main(String[] args) {

    }
}

//饿汉式
class Demo1{
    private static final Demo1 d1 = new Demo1();
    private Demo1(){

    }

    public static Demo1 getInstance(){
        return d1;
    }
}

//懒汉式
class Demo2{
    public static Demo2 d2;
    private Demo2(){}

    public static Demo2 getInstance(){
        if(d2 == null){
            d2 = new Demo2();
        }
        return d2;
    }
}

//线程安全的懒汉式
class Demo3{
    private static Demo3 d3;
    private Demo3(){}

    public static synchronized Demo3 getInstance(){
        if(d3 == null){
            d3 = new Demo3();
        }
        return d3;
    }
}

//DCL双检查锁机制单例
class Demo4{
    private static volatile Demo4 d4;
    private Demo4(){}

    public static synchronized Demo4 getInstance(){
        if(d4 == null){
            synchronized (Demo4.class){
                if(d4 == null){
                    d4 = new Demo4();
                }
            }
        }
        return d4;
    }
}
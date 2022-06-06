package JavaBase.day4_28;


public class Test1 {
    public static void main(String[] args) {

    }
}

//饿汉式
class Singleton1{
    private static final Singleton1 s1 = new Singleton1();

    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return s1;
    }
}

//懒汉式
class Singleton2{
    private static Singleton2 s2;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(s2 == null){
            s2 = new Singleton2();
        }
        return s2;
    }
}

//带锁的懒汉式
class Singleton3{
    private static Singleton3 s3;
    private Singleton3(){}
    public static synchronized Singleton3 getInstance(){
        if(s3 == null){
            s3 = new Singleton3();
        }
        return s3;
    }
}

//DCL双检查锁机制懒汉
class Singleton4{
    private volatile static Singleton4 s4;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(s4 == null){
            synchronized(Singleton4.class){
                if(s4 == null){
                    s4 =new Singleton4();
                }
            }
        }
        return s4;
    }
}

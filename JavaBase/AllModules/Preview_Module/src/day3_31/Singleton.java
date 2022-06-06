package day3_31;

public class Singleton {
    /*private static Singleton s =new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return s;
    }*/
    private static Singleton s;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(s ==null){
            s= new Singleton();
        }
        return s;
    }
}

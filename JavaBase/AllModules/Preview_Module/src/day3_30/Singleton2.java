package day3_30;

public class Singleton2 {
    private static Singleton2 s;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(s == null){
            s =new Singleton2();
        }
        return s;
    }
}

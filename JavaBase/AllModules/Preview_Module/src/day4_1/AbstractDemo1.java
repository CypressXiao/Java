package day4_1;

public class AbstractDemo1 {
    public static void main(String[] args) {
    A a1 =new B();
    c(new B());
    a1.b();
    }
    public static void c(A a){
        a.a();
        a.b();
    }
}

abstract class A{
    abstract public void a();
    abstract  public void b();
}

class B extends A{
    public void a(){
        System.out.println("hahaha");
    }
    public void b(){
        System.out.println("呵呵呵");
    }
}
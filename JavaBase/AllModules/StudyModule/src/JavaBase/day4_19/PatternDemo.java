package JavaBase.day4_19;

public class PatternDemo {
    public static void main(String[] args) {
       new Per<String>().get("666666");
        new Per2().eat("s");
    }
}


class Person<T>{
    String name;
    T age;

    public void show(T age){
        System.out.println(age);
    }
}

interface Person1<T>{
    void get(T t);
}

class Per<T> implements Person1<T>{


    @Override
    public void get(T t) {
        System.out.println(t);
    }
}

class Per2{
    public<T> void eat(T t){
        System.out.println(t);
    }
}
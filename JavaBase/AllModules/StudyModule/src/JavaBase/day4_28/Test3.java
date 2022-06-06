package JavaBase.day4_28;


import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        final Demo d = new Demo();
        d.test();
    }
}

class Demo{
    ArrayList<String> a;
    public void test(){
        System.out.println(a);
    }
}

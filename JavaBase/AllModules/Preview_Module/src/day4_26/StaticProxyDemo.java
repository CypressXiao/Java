package day4_26;

public class StaticProxyDemo {
    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.test();
    }
}

interface A{
    public abstract void test();
}

class Demo1 implements A{


    @Override
    public void test() {
        System.out.println("湖人总冠军!");
    }
}

class Demo2 implements A{

    Demo1 d1 = new Demo1();

    @Override
    public void test() {
        System.out.println("增强开始!");
        d1.test();
        System.out.println("增强结束!");
    }
}

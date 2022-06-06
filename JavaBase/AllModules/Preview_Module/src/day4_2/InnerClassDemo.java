package day4_2;;

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass.InnerClass Inner = new OuterClass().new InnerClass();
        Inner.Out();
        OuterClass.test1();
        new OuterClass().method();
        System.out.println(OuterClass.StaticInnerClass.age);
        System.out.println(new OuterClass.StaticInnerClass().name);
    }
}

class OuterClass {
    static int a = 100;
    public static void test1() { }
    int b = 1;

    class InnerClass {
        int b = 2;
        public void Out() {
            int b = 3;
            System.out.println(a);
            System.out.println(b);
            System.out.println(this.b);
            System.out.println(OuterClass.this.b);
        }
    }

    public void method() {
        class InnerClass1 {
            public void test () {
                System.out.println("test");
            }
        }
        new InnerClass1().test();
    }

    static class StaticInnerClass{
        String name ="张三";
        static int age = 28;
    }
}
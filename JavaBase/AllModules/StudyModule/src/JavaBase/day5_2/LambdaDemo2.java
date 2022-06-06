package JavaBase.day5_2;

public class LambdaDemo2 {
    public static void main(String[] args) {

        get(() -> System.out.println("我一年赚了100w"));
        show((String name) -> System.out.println(name));


        sum((a,b)-> System.out.println(a+b),4,5);

        get((a, b) ->{ return a+b;},8,9);
    }

    public static void get(User user) {
        user.getMoney();
    }

    public static void show(Test test) {
        test.set("Cypress");
    }
    public static void sum(Math1 m,int a,int b){
        m.getSum(a,b);
    }

    public static void get(d3 d,int a,int b){
        int sum = d.getSum(a, b);
        System.out.println(sum);
    }


}

interface User {
    void getMoney();
}

interface Test {
    void set(String name);
}

interface Math1 {
    void getSum(int a, int b);
}

interface  d3{
    int getSum(int a,int b);
}
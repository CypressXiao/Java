package JavaBase.day5_2;

public class Test1 {
    public static void main(String[] args) {
        sum(new B());
    }
    public static void sum(A a){
        a.getSum(10,5);
    }
}

interface A{
    void getSum(int a,int b);
}

class B implements A{

    @Override
    public void getSum(int a, int b) {
        System.out.println(a+b);
    }
}

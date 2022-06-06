package JavaBase.day5_2;

public class DailyReviewDemo1 {
    public static void main(String[] args) {
        sum(() -> System.out.println("10"));
        System.out.println("===============================");
        sum((a,b) -> System.out.println(a+b));
        System.out.println("===============================");
        sum(()-> 18);
        System.out.println("===============================");
        int sum1 = sum((int... a) -> {
            int sum = 0;
            for (int i : a) {
                sum += i;
            }
            return sum;
        });
        System.out.println(sum1);

    }

    public static void sum(A1 a1) {
        a1.getSum1();
    }

    public static void sum(A2 a2) {
        a2.getSum2(6, 6);//调用方法时要传参!!!!
    }

    public static void sum(A3 a3){
        int num = a3.getSum3();
        System.out.println(num+10);
    }

    public static int sum(A4 a4){
        return a4.getSum4(1,2,3,4,5)+10;
    }
}

//无参无反回值
interface A1 {
    void getSum1();
}

//有参无返回值
interface A2 {
    void getSum2(int a, int b);
}

//无参有返回值
interface A3{
    int getSum3();
}

//有参有返回值
interface A4{
    int getSum4(int...a);
}
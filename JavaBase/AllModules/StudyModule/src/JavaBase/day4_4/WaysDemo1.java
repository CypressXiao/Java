package JavaBase.day4_4;

public class WaysDemo1 {
    int a = 10;

    public static void main(String[] args) {
        WaysDemo1 A = new WaysDemo1();
        A.a();
    }

    public void a(){
        int a = 5;
        System.out.println(a);
        System.out.println(this.a);
    }
}

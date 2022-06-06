package day4_21;

public class JoinDemo {
    public static void main(String[] args) {
        Sum s =new Sum();
        s.start();
        try {
            s.join();//先执行s线程,再执行s所在的线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Sum.sum);
    }
}

class Sum extends Thread{
    static int sum = 0;
    public void run(){
        for (int i = 0; i <1000 ; i++) {
            sum+=i;
        }
    }
}

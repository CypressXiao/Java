package day4_25;

public class MultiThreadPractice2 {

    //编写两个线程,一个线程打印1-52的整数，另一个线程打印字母A-Z。打印顺序为12A34B56C….5152Z。
// 即按照整数和字母的顺序从小到大打印，并且每打印两个整数后，打印一个字母，交替循环打印，直到打印到整数52和字母Z结束。
    private static final Object obj = new Object();
    private static int num = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 1; i <= 52; i++) {
                synchronized (obj) {
                    try {
                        if (num % 3 == 2) {
                            obj.wait();
                        }
                        System.out.println(i);
                        num++;
                        obj.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(()->{
            for(char ch ='A';ch<='Z';ch++) {
                synchronized (obj) {
                    try {
                        if (num % 3 != 2) {
                            obj.wait();
                        }
                        System.out.println(ch);
                        num++;
                        obj.notifyAll();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}

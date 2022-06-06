package day4_25;

public class OrderPrintDemo2 {
    private static final Object lock = new Object();
    private static char currentChar = 'A';

    public static void main(String[] args) {
        //定义A线程
        Thread A = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while (currentChar != 'A') {
                            lock.wait();
                        }
                        System.out.println("A");
                        currentChar = 'B';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //定义B线程
        Thread B = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while (currentChar != 'B') {
                            lock.wait();
                        }
                        System.out.println("B");
                        currentChar = 'C';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //定义c线程
        Thread C = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while (currentChar != 'C') {
                            lock.wait();
                        }
                        System.out.println("C");
                        currentChar = 'D';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread D = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while (currentChar != 'D') {
                            lock.wait();
                        }
                        System.out.println("D");
                        currentChar = 'A';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        //开启三个线程
        A.start();
        B.start();
        C.start();
        D.start();
    }
}

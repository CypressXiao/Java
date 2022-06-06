package day4_24;

public class PracticeDemo4 {
    private static Object lock = new Object();
    private static char currentChar = 'A';

    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while (currentChar != 'A') {
                            lock.wait();
                        }
                        System.out.println("A");
                        currentChar ='B';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread B = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while(currentChar != 'B') {
                            lock.wait();
                        }
                        System.out.println("B");
                        currentChar ='C';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread C = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10; ) {
                    try {
                        while (currentChar != 'C') {
                            lock.wait();
                        }
                        System.out.println("C");
                        currentChar ='A';
                        i++;
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        A.start();
        B.start();
        C.start();
    }
}

package day4_21;

public class InterruptDemo {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.start();
        d.interrupt();//打断阻塞,打断后抛出异常说明已经打断成功!!!!
        System.out.println("over");
    }
}

class Demo2 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <30 ; i++) {
            System.out.println(i);
        }
    }
}

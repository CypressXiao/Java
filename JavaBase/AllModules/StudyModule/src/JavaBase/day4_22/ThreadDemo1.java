package JavaBase.day4_22;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread.currentThread().setName("冯诺依曼");
        Demo1 d1 = new Demo1();
        d1.setName("迪丽热巴");
        Demo1 d2 = new Demo1();
        d2.setName("古力娜扎");

        d1.start();
        d2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}

class Demo1 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}

package day4_21;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Demo d1 = new Demo("Allen");
        Demo d2 = new Demo("Jack");

        d1.start();
        d2.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println(d1.getName());
        System.out.println(d2.getName());
    }
}

class Demo extends Thread{
    String name;

    public Demo(String name){
        this.name = name;
    }

    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <30 ; i++) {
            System.out.println(name+"-------"+i);
        }
    }
}

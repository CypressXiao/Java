package JavaBase.day4_25;

import java.util.ArrayList;

public class ProducerAndConsumerDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        new Thread(new Producer(list),"生产者").start();
        new Thread(new Consumer(list),"消费者").start();
    }
}

class Producer implements Runnable{

    private final ArrayList<String> list;

    public Producer(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            try {
                synchronized (list){
                    if(list.size() == 0){
                        list.add("包子");
                    }
                    System.out.println(list);
                    Thread.sleep(100);
                    //包子添加成功就唤醒消费者
                    list.notify();
                    //生产者处于等待状态
                    list.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{

    private final ArrayList<String> list;

    public Consumer(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true) {
            try {
                synchronized (list) {
                    if (list.size() > 0) {
                        list.remove(0);
                    }
                    System.out.println("包子已吃完"+list);
                    Thread.sleep(100);
                    //吃完包子后,就唤醒生产者
                    list.notify();
                    //消费者处于等待状态
                    list.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

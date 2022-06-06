package day3_24;

import java.util.Random;

public class CallNameSystem {
    public static void main(String[] args) {
        String[] allName = new String[]{"小明","小张","小王","小李","小肖","小江","小赵"};
        Random ran = new Random();
        int a = ran.nextInt(allName.length);
        System.out.println(a);
        System.out.println("此次点名点到的是："+allName[a]);
    }
}

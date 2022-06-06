package JavaBase.day4_4;

import java.util.Random;

public class WaysDemo3 {
    public static void main(String[] args) {
        int ran1 = getRandom();
        System.out.println("随机数为:" + ran1);
    }

    public static int getRandom() {
        Random ran = new Random();
        return ran.nextInt(100);
    }
}

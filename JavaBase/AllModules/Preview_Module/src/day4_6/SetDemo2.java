package day4_6;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        Random ran = new Random();
        while (set.size() < 10) {
            int ran1 = ran.nextInt(20) + 1;
            set.add(ran1);
        }
        System.out.println(set);
    }
}

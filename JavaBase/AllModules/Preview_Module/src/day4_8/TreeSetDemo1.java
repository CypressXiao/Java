package day4_8;

import java.util.Comparator;
import java.util.Set;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Set<Integer> set = new java.util.TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(6);
        System.out.println(set);

        Set<Integer> set1 =new java.util.TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        set1.add(1);
        set1.add(2);
        set1.add(5);
        set1.add(3);
        set1.add(6);
        System.out.println(set1);

    }
}

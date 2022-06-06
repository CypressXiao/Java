package JavaBase.day4_19;

import java.util.*;

public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(16);
        list.add(12);
        list.add(17);

        Collections.sort(list);
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);

        ListIterator<Integer> list2 = list.listIterator(list.size());
        while(list2.hasPrevious()){
            System.out.println(list2.previous());
        }
    }
}

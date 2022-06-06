package day4_8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> map =new TreeMap<>();
        map.put(1,"a");
        map.put(3,"f");
        map.put(2,"d");
        map.put(6,"g");
        System.out.println(map);//默认根据key进行排序

        Map<Integer,String> map1 =new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        map1.put(1,"a");
        map1.put(3,"f");
        map1.put(2,"d");
        map1.put(6,"g");
        System.out.println(map1);

    }
}

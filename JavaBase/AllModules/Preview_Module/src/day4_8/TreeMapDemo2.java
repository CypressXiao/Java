package day4_8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        Map<Teachers,Integer> map = new TreeMap<>();
        map.put(new Teachers("张三",32,"男"),003);
        map.put(new Teachers("李四",31,"女"),002);
        map.put(new Teachers("王五",30,"男"),001);
        System.out.println(map);

        Map<Teachers,Integer> map1 = new TreeMap<>(new Comparator<Teachers>() {
            @Override
            public int compare(Teachers o1, Teachers o2) {
                return o1.age-o2.age;
            }
        });
        map1.put(new Teachers("张三",32,"男"),003);
        map1.put(new Teachers("李四",31,"女"),002);
        map1.put(new Teachers("王五",30,"男"),001);
        System.out.println(map1);
    }
}



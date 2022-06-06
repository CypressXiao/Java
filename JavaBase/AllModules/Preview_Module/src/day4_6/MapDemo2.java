package day4_6;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> m =new HashMap<>();
        m.put("小明",25);
        m.put("小红",26);
        m.put("小王",24);
        m.put("小明",25);
        System.out.println(m);

        //用keySet遍历
        Set<String> set =m.keySet();
        for (String s : set) {
            System.out.println(s+":"+m.get(s));
        }
        System.out.println("--------------------------------");
        //用entry遍历

        Set<Map.Entry<String,Integer>> entry = m.entrySet();
        for (Map.Entry<String, Integer> e : entry) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println("--------------------------------");

        //用迭代器遍历
        Iterator<Map.Entry<String,Integer>> it = entry.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry1 = it.next();
            System.out.println(entry1.getKey()+":"+entry1.getValue());
        }
        System.out.println("--------------------------------");

        //得到values值
        Collection<Integer> c = m.values();
        for (Integer integer : c) {
            System.out.println(integer);
        }
    }
}

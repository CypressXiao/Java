package JavaBase.day4_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class DouDizhuDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        String[] s1 ={"♥","♠","♣","♦"};
        String[] s2 ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index = 0;
        for (String s : s2) {
            for (String value : s1) {
                String s3 = value + s;
                map.put(index++,s3);
            }
        }
        map.put(index++,"小王");
        map.put(index,"大王");
        Set<Integer> set = map.keySet();
        ArrayList<Integer> l1 = new ArrayList<>(set);

        Collections.shuffle(l1);

        ArrayList<Integer> 底牌 = new ArrayList<>();
        ArrayList<Integer> 张三 = new ArrayList<>();
        ArrayList<Integer> 李四 = new ArrayList<>();
        ArrayList<Integer> 王五 = new ArrayList<>();


        for (int i = 0; i < l1.size(); i++) {
            if(i>=51){
                底牌.add(l1.get(i));
            }else if(i%3==0){
                张三.add(l1.get(i));
            }else if(i%3==1){
                李四.add(l1.get(i));
            }else{
                王五.add(l1.get(i));
            }
        }
        System.out.println(getOrder(map, 底牌));
        System.out.println(getOrder(map, 张三));
        System.out.println(getOrder(map, 李四));
        System.out.println(getOrder(map, 王五));
    }

    public static ArrayList<String> getOrder(HashMap<Integer,String> map,ArrayList<Integer> list){
        ArrayList<String> list1 = new ArrayList<>();
        Collections.sort(list);
        for (Integer i : list) {
            list1.add(map.get(i));
        }
        return list1;
    }
}

package day4_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 有如下字符串:
 * 成龙,10000;李冰冰,200000;李连杰,30000;李冰冰,10000;成龙,50000;李连杰,40000
 * 求出每个明星的捐款总额和次数
 */
public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String str = "成龙,10000;李冰冰,200000;李连杰,30000;李冰冰,10000;成龙,50000;李连杰,40000";
        String[] str1 =str.split(";");
        for(int i =0;i<str1.length;i++){
            String str2 =str1[i];
            String[] str3 =str2.split(",");
            String str4 = str3[0];
            Integer count =map1.get(str4);
            Integer sum = map2.get(str4);
            if(count == null){
                map1.put(str4,1 );
                map2.put(str4,Integer.valueOf(str3[1]));
            }else{
                count++;
                sum +=Integer.parseInt(str3[1]);
                map1.put(str4,count);
                map2.put(str4,sum);
            }
        }
        Set<String> set = map1.keySet();
        for (String s : set) {
            System.out.println(s+"共捐款"+map1.get(s)+"次,共捐款"+map2.get(s)+"元");
        }
    }
}


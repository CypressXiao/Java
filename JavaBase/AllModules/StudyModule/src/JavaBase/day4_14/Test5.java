package JavaBase.day4_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * "成龙,3000;李连杰,5000;李冰冰,2000;成龙,20000;李连杰,30000"将该字符串进行处理,复制给对象,然后打印所有的对象,
 *     要求求出每个对象的捐款总额和捐款次数
 */
public class Test5 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        String str1 = "成龙,3000;李连杰,5000;李冰冰,2000;成龙,20000;李连杰,30000";
        String[] str2 = str1.split(";");
        for (String s : str2) {
            String[] str3 = s.split(",");
            if (!map1.containsKey(str3[0]) && !map2.containsKey(str3[0])) {
                map1.put(str3[0], 1);
                map2.put(str3[0], Integer.parseInt(str3[1]));
            } else {
                int count = map1.get(str3[0])+1;
                int sum =map2.get(str3[0])+ Integer.parseInt(str3[1]);
                map1.put(str3[0], count);
                map2.put(str3[0], sum);
            }
        }
        ArrayList<Stars> list = new ArrayList<>();
        Set<String> set = map1.keySet();
        for (String s1 : set) {
            Stars star = new Stars(s1, map2.get(s1), map1.get(s1));
            list.add(star);
        }
        System.out.println(list);
    }
}

class Stars{
    String name;
    int donate;
    int count;

    public Stars(String name, int donate) {
        this.name = name;
        this.donate = donate;
    }

    public Stars(String name, int donate, int count) {
        this.name = name;
        this.donate = donate;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Stars{" +
                "姓名:" + name +
                ", 捐款金额:" + donate +
                ", 捐款次数:" + count +
                '}';
    }
}


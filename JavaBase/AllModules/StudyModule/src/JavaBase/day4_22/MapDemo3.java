package JavaBase.day4_22;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Star> map = new HashMap<>();
        String str1 = "成龙,3000;李连杰,5000;李冰冰,2000;成龙,20000;李连杰,30000";
        String[] s1 = str1.split(";");
        for (String s : s1) {
            String[] s2 = s.split(",");
            String str2 = s2[0];
            int money = Integer.parseInt(s2[1]);
            if (!map.containsKey(str2)) {
                map.put(str2, new Star(str2, 1, money));
            } else {
                int count = map.get(str2).getCount();
                count++;
                money += map.get(str2).getMoney();
                map.put(str2, new Star(str2, count, money));
            }
        }
        System.out.println(map);
    }
}

class Star {
    private String name;
    private int count;
    private int money;

    public Star() {
    }

    public Star(String name, int count, int money) {
        this.name = name;
        this.count = count;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", money=" + money +
                '}';
    }
}

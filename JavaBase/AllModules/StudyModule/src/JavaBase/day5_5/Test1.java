package JavaBase.day5_5;


import java.io.*;
import java.util.HashMap;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/5 14:14
 * @Version 1.0
 */

public class Test1 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\wdcount.txt")));
            HashMap<String, Integer> map = new HashMap<>();
            String s;
            while ((s = br.readLine()) != null) {
                String[] str = s.split("\\s+");
                for (String s1 : str) {
                    if (!map.containsKey(s1)) {
                        map.put(s1, 1);
                    } else {
                        map.put(s1, map.get(s1) + 1);
                    }
                }
            }
            System.out.println(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

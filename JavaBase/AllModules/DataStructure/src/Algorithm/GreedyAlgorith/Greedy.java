package Algorithm.GreedyAlgorith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName Greedy
 * @Description 贪心算法
 * @Author 肖榆柏
 * @Date 2022/5/22 7:42
 * @Version 1.0
 */

public class Greedy {
    public static void main(String[] args) {
        //创建广播电台,放入到Map
        HashMap<String,HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
        //将各个电台放入到broadcasts
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");

        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");

        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");


        HashSet<String> hashSet4 = new HashSet<String>();
        hashSet4.add("上海");
        hashSet4.add("天津");

        HashSet<String> hashSet5 = new HashSet<String>();
        hashSet5.add("杭州");
        hashSet5.add("大连");

        //加入到map
        broadcasts.put("K1", hashSet1);
        broadcasts.put("K2", hashSet2);
        broadcasts.put("K3", hashSet3);
        broadcasts.put("K4", hashSet4);
        broadcasts.put("K5", hashSet5);

        //allAreas 存放所有的地区
        HashSet<String> allAreas = new HashSet<String>();
        allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("深圳");
        allAreas.add("成都");
        allAreas.add("杭州");
        allAreas.add("大连");

        //创建一个集合去存储目标结果
        ArrayList<String> list = new ArrayList<>();
        //创建一个临时的集合去存储与allAreas的公共变量
        HashSet<String> tempSet = new HashSet<>();
        //定义指向公共部分最长的集合的指针
        String maxKey = null;
        //当allAreas当中还有元素开始继续循环
        while (allAreas.size()!=0){
            maxKey = null;
            //遍历所有广播
            for (String s : broadcasts.keySet()) {
                tempSet.clear();
                HashSet<String> area = broadcasts.get(s);
                //把每个中的地区得到后和allAreas取交集
                tempSet.addAll(area);
                tempSet.retainAll(allAreas);
                HashSet<String> set1 = new HashSet<>();
                if(maxKey!=null){
                    set1 = broadcasts.get(maxKey);
                    set1.retainAll(allAreas);
                }
                //进行判断以获取maxKey
                if(tempSet.size()>0 &&(maxKey == null || tempSet.size()>set1.size())){
                    maxKey = s;
                }
            }
            if(maxKey !=null){
                //将maxKey加入集合
                list.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));
            }
        }
        System.out.println(list);
    }
}

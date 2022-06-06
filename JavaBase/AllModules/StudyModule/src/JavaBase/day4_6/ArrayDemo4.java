package JavaBase.day4_6;

import java.util.ArrayList;

public class ArrayDemo4 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();

        str.add("大乔");
        str.add("小乔");
        str.add("小乔");
        str.add("大乔");
        str.add("大乔");
        str.add("小乔");

        //需求:  删除重复的元素  保留其中的一个
        //使用选择排序的方式  对集合进行去重操作
        // 字符串和字符串之间比较是否相同时  一定不要用==  建议是用户equals()方法
        //equals()方法  如果相同  返回true  如果不同  返回false
        for(int i=0;i<str.size()-1;i++) {
            for (int j = i + 1; j < str.size(); j++) {
                if (str.get(i).equals(str.get(j))) {
                    str.remove(j);
                    j--;
                }
            }
        }
        System.out.println(str);
    }
}

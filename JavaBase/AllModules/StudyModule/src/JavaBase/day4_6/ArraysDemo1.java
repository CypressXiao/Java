package JavaBase.day4_6;

import java.util.ArrayList;

public class ArraysDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.size());

        System.out.println(list.get(0));

        System.out.println(list.set(1,5));//返回值是替代位置的原值
        list.add(3,6);
        System.out.println(list);

        list.remove((Integer) 5);//可以删除integer集合中的指定元素

        System.out.println(list);
    }
}

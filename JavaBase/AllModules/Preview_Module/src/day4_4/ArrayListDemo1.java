package day4_4;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Byte> list1 = new ArrayList<Byte>();
        ArrayList<Short> list2 = new ArrayList<Short>();
        ArrayList<Long> list3 = new ArrayList<Long>();
        ArrayList<Character> list4 = new ArrayList<Character>();
        ArrayList<Boolean> list5 =  new ArrayList<Boolean>();
        ArrayList<Float> list6 = new ArrayList<Float>();
        ArrayList<Double> list7 =new ArrayList<Double>();
        ArrayList<String> list8 =new ArrayList<String>();
        ArrayList<int[]> list9 =new ArrayList<int[]>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.remove(1));

        list.add(2,5);
        System.out.println(list);

        System.out.println(list.set(3,6));

        System.out.println(list);

        //list.clear();
        //遍历打印
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

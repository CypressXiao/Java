package day3_31;

import java.util.ArrayList;
import java.util.List;

//List的用法
public class Test {
    public static void main(String[] args) {
        /*List<String> message=new ArrayList<>();
        message.add("namea");  //往List中添加数据
        message.add("age");
        for(int i=0;i<message.size();i++) {
            // 仅下面这一行就可以输出List中的数据
            System.out.println(message.get(i));

            //下面这段代码也可以用来输出，主要是要显示一下split()方法
            String[] data=message.get(i).split(",");   //需要用get()方法获得List的值，然后以逗号进行分割
            for(int j=0;j<data.length;j++) {
                System.out.println(data[j]);*/
        String a = "白龙马", b = "沙和尚", c = "八戒", d = "唐僧", e = "悟空";
        List<String> people = new ArrayList<>();
        people.add(a);
        people.add(b);
        people.add(c);
        people.set(0, d);   //.set(index, element);     //将d唐僧放到list中索引为0的位置，替换a白龙马
        people.add(1, e);   //.add(index, element);     //将e悟空放到list中索引为1的位置,原来位置的b沙和尚后移一位

        //增强for循环遍历list
        for (String str : people) {
            System.out.println(str);
        }

    }
}



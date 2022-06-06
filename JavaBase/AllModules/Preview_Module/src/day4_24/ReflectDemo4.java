package day4_24;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //w往ArrayList<String>中添加一个整数
        ArrayList<String> list = new ArrayList<>();
        list.add("Cypress");

        Class clazz =list.getClass();


        Method add = clazz.getMethod("add",Object.class);

        add.invoke(list,100);

        System.out.println(list);

    }
}

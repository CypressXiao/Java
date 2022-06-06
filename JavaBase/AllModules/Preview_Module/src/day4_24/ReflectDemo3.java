package day4_24;

import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("day4_24.Person1");

        Field[] fs1 = clazz.getFields();
        for (Field f : fs1) {
            System.out.println(f);
        }
        System.out.println("-------------------------------------------");

        Field[] fs2 = clazz.getDeclaredFields();
        for (Field f : fs2) {
            System.out.println(f);
        }
        System.out.println("-------------------------------------------");

        Object o = clazz.newInstance();
        Field f1 = clazz.getField("name");
        f1.set(o,"张三");

        Field f2 = clazz.getDeclaredField("age");
        f2.setAccessible(true);
        f2.set(o,18);

        Field f3 = clazz.getDeclaredField("gender");
        f3.set(o,'男');

        Field f4 = clazz.getDeclaredField("height");
        f4.set(o,73.2);

        Field f5 = clazz.getDeclaredField("a");
        f5.set(null,100);
        System.out.println(o);

    }
}

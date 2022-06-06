package day4_24;

import java.lang.reflect.Constructor;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("day4_24.Person1");
        Constructor[] cs1 = clazz.getConstructors();
        for (Constructor cs : cs1) {
            System.out.println(cs);
        }
        System.out.println("-----------------------------------------------");

        final Constructor[] cs2 = clazz.getDeclaredConstructors();
        for (Constructor cs : cs2) {
            System.out.println(cs);
        }
        System.out.println("-----------------------------------------------");

        Constructor c1= clazz.getConstructor(String.class,int.class,char.class);
        final Object o = c1.newInstance("张三", 18, '男');
        System.out.println(o);
        System.out.println("-----------------------------------------------");

        Constructor c2 =clazz.getDeclaredConstructor(String.class,int.class);
        Object o1 = c2.newInstance("李四",20);//因为o1是Person1的类故protect修饰的构造方法也可以创建对象
        System.out.println(o1);
        System.out.println("-----------------------------------------------");


        Constructor c3 = clazz.getDeclaredConstructor(int.class);
        c3.setAccessible(true);//可以通过该方法访问私有的构造方法创建对象
        Object o3 = c3.newInstance(20);
        System.out.println(o3);
    }
}

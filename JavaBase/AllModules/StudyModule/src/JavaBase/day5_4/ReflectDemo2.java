package JavaBase.day5_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName ReflectDemo2
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 15:29
 * @Version 1.0
 */

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("JavaBase.day5_4.Person1");

        Constructor<?> con1 = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        con1.setAccessible(true);
        final Object o = con1.newInstance("张三", 30, "男");
        System.out.println(o);
        System.out.println("=================================================");

        final Field df1 = clazz.getDeclaredField("age");
        df1.set(o,10);
        System.out.println(o);
        System.out.println("=================================================");

        final Method get = clazz.getDeclaredMethod("get", double.class);
        System.out.println(get.invoke(o, 10.0));

    }
}

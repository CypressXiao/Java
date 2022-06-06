package JavaBase.day5_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName ReflectDemo1
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 14:51
 * @Version 1.0
 */

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception{
        final Person1 p = new Person1();
        //获取字节码文件的的三种方式
        Class<Person1> clazz = Person1.class;
        System.out.println(clazz);
        Class<? extends Person1> clazz1 = p.getClass();
        System.out.println(clazz1);
        Class<?> clazz2 = Class.forName("JavaBase.day5_4.Person1");
        System.out.println(clazz2);
        System.out.println("=================================================");

        final Constructor<?>[] dcon1 = clazz2.getDeclaredConstructors();
        Arrays.stream(dcon1).forEach(System.out::println);
        System.out.println("=================================================");
        final Constructor<?>[] con2 = clazz2.getConstructors();
        System.out.println(Arrays.toString(con2));
        System.out.println("=================================================");
        final Method[] dme = clazz2.getDeclaredMethods();
        Arrays.stream(dme).forEach(System.out::println);
        System.out.println("=================================================");
        final Field[] f1 = clazz2.getDeclaredFields();
        Arrays.stream(f1).forEach(System.out::println);
    }
}
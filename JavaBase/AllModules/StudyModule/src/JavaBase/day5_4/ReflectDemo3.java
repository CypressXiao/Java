package JavaBase.day5_4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName ReflectDemo3
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 16:05
 * @Version 1.0
 */

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        ArrayList<Person1> list = new ArrayList<>();
        final Class<?> clazz = Class.forName("JavaBase.day5_4.Person1");
        final Constructor<?> con1 = clazz.getDeclaredConstructor(String.class, int.class, String.class, double.class);
        Person1 o = (Person1) con1.newInstance("张三", 10, "女", 10000.0);
        Person1 o1 = (Person1) con1.newInstance("李四", 20, "男", 15000.0);

        list.add(o);
        list.add(o1);

        final Class<?> clazz1 = Class.forName("JavaBase.day5_4.Student");
        final Constructor<?> dec = clazz1.getDeclaredConstructor(String.class, int.class);
        dec.setAccessible(true);
        final Object o2 = dec.newInstance("小红", 99);

        final Field grade = clazz1.getDeclaredField("grade");
        grade.setAccessible(true);
        grade.set(o2,100);

        Class<? extends ArrayList> clazz2 = list.getClass();
        final Method add = clazz2.getDeclaredMethod("add", Object.class);
        add.invoke(list,o2);

        System.out.println(list);

    }
}

class Student{
    private final String name;
    private final int grade;

    private Student(String name,int grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

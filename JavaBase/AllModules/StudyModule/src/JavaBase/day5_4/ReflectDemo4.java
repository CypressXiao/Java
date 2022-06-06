package JavaBase.day5_4;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @ClassName ReflectDemo4
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 16:44
 * @Version 1.0
 */

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);

        final Class<? extends ArrayList> clazz = list.getClass();

        final Method add = clazz.getDeclaredMethod("add", Object.class);

        add.invoke(list, "Cypress");

        System.out.println(list);

        //反射list中的成员就变成Object类
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

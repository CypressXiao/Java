package JavaBase.day5_4;

import JavaBase.day4_29.Teacher;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @ClassName ReflectDemo6
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 20:16
 * @Version 1.0
 */

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
        /*//常规多态方式
        ReflectDemo6.teach(new NewTeacher());
        ReflectDemo6.teach(new OldTeacher());*/

        //采用反射的方式实现,常规的多态方式要new对象,若修改时需要大量改代码.使用反射则避免了该问题
        final Properties pro = new Properties();
        //pro.load(new FileInputStream("JavaBase\\AllModules\\conf\\teacher_name.properties"));
        pro.load(ReflectDemo6.class.getClassLoader().getResourceAsStream("teacher_name.properties"));
        final Class<?> clazz = Class.forName(pro.getProperty("teacher_name"));
        final TeacherAction t =(TeacherAction) clazz.newInstance();
        t.teach();


    }

    /*public static void teach(TeacherAction t){
        t.teach();
    }*/
}

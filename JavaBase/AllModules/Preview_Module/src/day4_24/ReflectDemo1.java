package day4_24;

public class ReflectDemo1 {
    //获取Class对象的三种方式
    public static void main(String[] args) throws Exception {
        Person1 p = new Person1();

        Class clazz1 = p.getClass();
        Class clazz2 = Person1.class;
        Class clazz3 =Class.forName("day4_24.Person1");

        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage());

        System.out.println(clazz1.getSuperclass());

        final Class[] interfaces = clazz1.getInterfaces();
        Object o = clazz1.newInstance();//用Class对象创建对象,为Object类,但是本质上是原类,此处用的是无参的构造
        System.out.println(o instanceof Person1);
    }
}

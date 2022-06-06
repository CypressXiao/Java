package day4_5;

public class ObjectDemo1 {
    public static void main(String[] args) {
        Person p =new Person();
        System.out.println(p.hashCode());

        Class a =p.getClass();
        System.out.println(a.getName());
        System.out.println(a.getSimpleName());
        System.out.println(a.getPackage());
    }
}


class Person{

}
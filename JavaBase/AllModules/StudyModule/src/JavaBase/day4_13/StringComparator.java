package JavaBase.day4_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringComparator {
    public static void main(String[] args) {
        ArrayList<Teacher1> list = new ArrayList<>();
        String s = "胡冠雨,男,23;刘勇,男,20;李舒琪,女,20;苏敏,女,21;昌林,男,22";
        String[] str =s.split(";");
        for (String s1 : str) {
            String[] str2 =s1.split(",");
            Teacher1 t = new Teacher1(str2[0],str2[1],Integer.parseInt(str2[2]));
            list.add(t);
        }
        /*Collections.sort(list);
        System.out.println(list);*/
        Collections.sort(list, new Comparator<Teacher1>() {
            @Override
            public int compare(Teacher1 o1, Teacher1 o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);
    }
}
class Teacher1 implements Comparable<Teacher1> {
    private String name;
    private String gender;
    private int age;

    public int getAge() {
        return age;
    }

    public void listAge(int age) {
        this.age = age;
    }

    public Teacher1(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher1{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Teacher1 o) {
        return this.age - o.age;
    }
}


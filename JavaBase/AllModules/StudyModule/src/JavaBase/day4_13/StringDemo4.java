package JavaBase.day4_13;

import java.util.ArrayList;

public class StringDemo4 {
    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<>();
        String s = "胡冠雨,男,23;刘勇,男,20;李舒琪,女,20;苏敏,女,21;昌林,男,22";
        /*String[] str = s.split(",");
        for (int i = 0; i <str.length ; i =i+3) {
            Teacher t = new Teacher(str[i],str[i+1],Integer.parseInt(str[i+2]));
            list.add(t);
        }
        System.out.println(list);*/

        String[] str1 =s.split(";");
        for (String s1 : str1) {
            String[] str2 =s1.split(",");
            Teacher t = new Teacher(str2[0],str2[1],Integer.parseInt(str2[2]));
            list.add(t);
        }
        System.out.println(list);

        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-1-i;j++){
                if(list.get(j).getAge() > list.get(j+1).getAge()){
                    Teacher temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println(list);


    }
}

class Teacher{
    private String name;
    private String gender;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
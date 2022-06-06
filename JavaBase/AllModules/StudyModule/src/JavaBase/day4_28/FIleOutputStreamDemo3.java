package JavaBase.day4_28;


import java.io.FileOutputStream;
import java.util.ArrayList;

public class FIleOutputStreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        String s = "张三,男,20;李四,女,22;王五,男,30;赵六,女,28;田七,男,50";
        String[] str = s.split(";");
        for (String s1 : str) {
            String[] s2 = s1.split(",");
            Person p = new Person(s2[0],s2[1],Integer.parseInt(s2[2]));
            list.add(p);
        }
        System.out.println(list);
        try(
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\a.txt");
        ) {
            fos.write("姓名\t年龄\t性别\n".getBytes());
            for (Person person : list) {
                fos.write((person.toString() + "\n").getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, String gender,int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name+"\t"+gender+"\t"+age;
    }

}

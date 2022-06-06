package JavaBase.day4_29;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ClassTestDemo1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Cypress_Xiao\\Desktop\\student.txt"));
        ) {
            String s;
            while((s = br.readLine())!=null){
                String[] s1 = s.split(",");
                Person p = new Person(s1[0],s1[1],Integer.parseInt(s1[2]));
                if(!list.contains(p)) {
                    list.add(p);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }
}

class Person {
    String name;
    String gender;
    int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age);
    }
}
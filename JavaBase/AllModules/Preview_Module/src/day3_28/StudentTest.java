package day3_28;

import static day3_28.Student.Study;

public class StudentTest {
    public static void main(String[] args) {
        day3_28.Student s1 = new day3_28.Student();
        day3_28.Student s2 = new day3_28.Student();
        s1.name = "Cypress";
        s1.age =26;
        s1.score = 95;
        s2.name ="宋健";
        s2.age =26;
        s2.score =96;
        System.out.println(s1.name);
        System.out.println(s2.score);
        Study();
        s2.Study1();
    }
}

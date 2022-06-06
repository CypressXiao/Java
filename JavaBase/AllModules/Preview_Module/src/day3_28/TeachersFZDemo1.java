package day3_28;

public class TeachersFZDemo1 {
    public static void main(String[] args) {
        TeachersFengZhuang t1 = new TeachersFengZhuang();
        t1.setName("Cypress");
        t1.setGender('男');
        t1.setAge(26);
        t1.setSalary(30000);

        String name = t1.getName();
        System.out.println(name);
        t1.show();
    }
}

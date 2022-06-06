package day3_28;

public class TeachersTest {
    public static void main(String[] args) {
        Teachers t1 = new Teachers();
        Teachers t2 = new Teachers();
        Teachers t3 = new Teachers();
        t1.name ="小明";
        t1.gender ="男";
        t1.age = 36;
        t1.salary =23456;
        t2.name ="小红";
        t2.gender ="女";
        t2.age = 26;
        t2.salary =14689;
        t3.name ="小王";
        t3.gender ="男";
        t3.age = 46;
        t3.salary =47893;
        Teachers[] teachers = new Teachers[]{t1,t2,t3};
        for (Teachers i : teachers) {
            System.out.println(i.salary);
        }

    }
}

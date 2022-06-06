package day3_29;

public class TeacherDemo {
    public static void main(String[] args) {
        TeacherGz t1 = new TeacherGz();
        t1.setName("Cypress") ;
        t1.setAge(26);
        t1.Show();

        TeacherGz t2 = new TeacherGz("宋健",26);
        //通过构造函数初始化之后用,用set对类中数据重新进行赋值
        t2.setAge(27);
        t2.Show();
    }
}

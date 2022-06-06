package JavaBase.day4_19;

public class CloneDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student("张三",20,new Car1("宝马"));
        System.out.println(st1);
        Student st2 = st1.clone();
        System.out.println(st2);
        st1.getCar().setName("奔驰");
        System.out.println(st1);
        System.out.println(st2);

    }

}

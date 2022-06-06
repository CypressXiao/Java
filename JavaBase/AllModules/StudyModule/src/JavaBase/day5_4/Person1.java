package JavaBase.day5_4;

/**
 * @ClassName Person
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 15:00
 * @Version 1.0
 */

public class Person1 {
    private String name;
    int age;
    protected String gender;
    public double salary;

    public Person1() {
    }

    private Person1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    protected Person1(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void get(){
        System.out.println(name);
    }

    void get(String name,int age){
        System.out.println(age);
    }

    private String get(String gender){
        return gender;
    }

    protected double get(double salary){
        System.out.println("我是被保护的方法!");
        return salary;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}

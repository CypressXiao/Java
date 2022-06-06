package day3_28;

public class TeachersFengZhuang {
    private String name;
    private char gender;
    private int age;
    private double salary;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender =gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
    public double getSalary(){
       return salary;
    }
    public void setSalary(double salary){
        this.salary =salary;
    }
    public void show(){
        System.out.println("name:"+name+",gender:"+gender+",age:"+age+",salary:"+salary);
    }
}
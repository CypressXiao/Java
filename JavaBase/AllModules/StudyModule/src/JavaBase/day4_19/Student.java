package JavaBase.day4_19;


public class Student implements Cloneable {
    private String name;
    private int age;
    Car1 car;

    public Student() {
    }

    public Student(String name, int age, Car1 car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car1 getCar() {
        return car;
    }

    public void setCar(Car1 car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }
}

class Car1{
   String name;

    public Car1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "'"+name +"'";
    }
}

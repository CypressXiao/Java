package day4_24;

public class Person1 implements A,B {
    public String name;
    private int age;
    char gender;
    protected double height;

    static int a;

    public Person1(){

    }

    private Person1(int age){
        this.age = age;
    }

    protected Person1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person1(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                '}'+a;
    }
}

interface A{

}

interface B{

}

package JavaBase.day4_7;

public class ObjectOrientedDemo3 {
}

class Dog2{
    private String name;
    private int age;
    private String gender;

    public Dog2(){

    }

    public Dog2(String name,int age,String gender){
        this.name =name;
        this.age =age;
        this.gender =gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void eat(){
        System.out.println("狗爱吃骨头!");
    }

    public void sleep(){
        System.out.println("狗睡眠少!");
    }
}

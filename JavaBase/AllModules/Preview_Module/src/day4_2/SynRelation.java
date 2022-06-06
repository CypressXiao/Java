package day4_2;;

public class SynRelation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Cypress");
        p.setGender('男');
        p.setAge(26);

        Mobile m = new Mobile();
        m.setBrand("iphone");
        m.setType("iphone 8");
        m.setPrice(6999);
        p.setMobile(m); //要先输入mobile的数据后才能用set方法给p中的mobile赋值

        Person p1 = new Person("Alan",'男',24,new Mobile("小米","note8",2999));
        //组合类中用构造方法进行初始化时,new一个引用类型
        p.show();
        p1.show();
    }

}

//person类中有mobile类
class Person {
    private String name;
    private char gender;
    private int age;
    private Mobile mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Person() {
    }

    public Person(String name, char gender, int age, Mobile mobile) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
    }

    public void show() {
        System.out.println("姓名:" + name + ",性别:" + gender + ",年龄:" + age + ",手机品牌:" + mobile.getBrand()
                + ",手机型号:" + mobile.getType() + ",手机价格为:" + mobile.getPrice());

    }
}

class Mobile {
    private String brand;
    private String type;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Mobile() {
    }

    public Mobile(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
}


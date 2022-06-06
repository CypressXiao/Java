package JavaBase.day4_22;




public class CloneableDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person1 per1 = new Person1("张三",30,new Car1("宾利",20000000));
        Person1 per2 = per1.clone();
        System.out.println(per1);
        System.out.println(per2);
        System.out.println("======================");
        per2.car.brand ="兰博基尼";
        System.out.println(per1);
        System.out.println(per2);
    }
}


class Person1 implements Cloneable{
    String name;
    int age;
    Car1 car;

    public Person1(String name, int age, Car1 car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    @Override
    protected Person1 clone() throws CloneNotSupportedException {
        Person1 per = (Person1)super.clone();
        per.car = car.clone();
        return per;
    }
}

class Car1 implements Cloneable{
    String brand;
    int price;

    public Car1(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected Car1 clone() throws CloneNotSupportedException {
        return (Car1)super.clone();
    }
}
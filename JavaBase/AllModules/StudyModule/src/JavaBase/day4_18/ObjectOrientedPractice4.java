package JavaBase.day4_18;

public class ObjectOrientedPractice4 {
    public static void main(String[] args) {
        Car car = new Car("奔驰","黑色",4);
        car.showCar();

        Truck truck = new Truck(20.0f,"巨卡","红色");
        truck.showTruck();
    }
}

class Vehicles{
    String brand;
    String color;

    public Vehicles(){}

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run(){
        System.out.println("我已经开动了!");
    }

    public void show(){
        System.out.println("商标为:"+brand+",颜色为:"+color);
    }
}

class Car extends Vehicles{
    int seats;

    public void showCar(){
        System.out.println("小汽车的品牌为:"+super.brand+",颜色为:"+super.color+",座位数为:"+seats);
    }
    public Car(){}

    public Car(int seats) {
        this.seats = seats;
    }

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }
}

class Truck extends Vehicles{
    float load;
    public void showTruck(){
        System.out.println("卡车的品牌为:"+super.brand+",颜色为:"+super.color+",载重量为:"+load);
    }
    public Truck(){}
    public Truck(float load){
        this.load = load;
    }

    public Truck(float load,String brand,String color){
        super(brand, color);
        this.load = load;
    }

}

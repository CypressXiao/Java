package JavaBase.day4_18;

public class ObjectOrientedPractice {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(50,12);
        v.move();
        v.speedUp();
        v.setSpeed(120);
        v.speedDown();
    }
}


class Vehicle {
    private double speed;
    private double size;

    public Vehicle() {
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public void move(){
        System.out.println("I am moving!");
    }

    public int setSpeed(int speed){
        return speed;
    }

    public void speedUp(){
        if(speed <20){ //可以有这种形式
            System.out.println("速度过慢,请稍微加速行驶!");
        }else if(speed<100){
            System.out.println("速度合适,不用加速了!");
        }
    }

    public void speedDown(){
        System.out.println("速度过快,请减速慢行!");
    }
}

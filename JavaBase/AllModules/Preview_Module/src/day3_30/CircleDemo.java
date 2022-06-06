package day3_30;

public class CircleDemo {
    public static void main(String[] args) {
        Circle cir1 =new Circle();
        cir1.setR(3.4);
        cir1.AreaPerimeter();

        Circle cir2 = new Circle(5.6);
        cir2.AreaPerimeter();
    }
}

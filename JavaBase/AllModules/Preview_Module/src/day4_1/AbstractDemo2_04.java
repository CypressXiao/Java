package day4_1;

import java.text.DecimalFormat;

public class AbstractDemo2_04 {
    public static void main(String[] args) {
        getShape3(new Rect3());
        getShape3(new Circle3());

    }

    public static void getShape3(Shape3 s) {
        s.area();
        s.perimeter();
    }
}


abstract class Shape3 {
    double length;
    double width;
    double r;

    public Shape3(double l,double w){
        this.length =l;
        this.width =w;
    }
    public Shape3(double r){
        this.r =r;
    }

    abstract public void perimeter();

    abstract public void area();
}


//子类输出长方形的周长和面积
class Rect3 extends Shape3 {
    public Rect3(){
        super(10,10);
    }
    public void perimeter() {
        double peri = (length + width) * 2;
        DecimalFormat df = new DecimalFormat(".000");
        System.out.println("长方形的周长为:" + df.format(peri));
    }

    public void area() {
        double area = length * width;
        DecimalFormat df = new DecimalFormat(".000");
        System.out.println("长方形的面积为:" + df.format(area));
    }
}

////子类输出圆的周长和面积
class Circle3 extends Shape3 {
    public Circle3(){
        super(10);
    }
    public void perimeter() {
        double peri = 2 * Math.PI * r;
        DecimalFormat df = new DecimalFormat(".000");
        System.out.println("圆的周长为:" + df.format(peri));
    }

    public void area() {
        double area = Math.PI * Math.pow(r, 2);
        DecimalFormat df = new DecimalFormat(".000");
        System.out.println("圆的面积为:" + df.format(area));
    }
}

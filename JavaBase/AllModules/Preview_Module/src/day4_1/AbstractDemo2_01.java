package day4_1;

import java.text.DecimalFormat;

public class AbstractDemo2_01 {
    public static void main(String[] args) {
        getShape(new Rect(10,10));
        getShape(new Circle(10));

    }
    public static void getShape(Shape s){
        s.area();
        s.perimeter();
    }
}


abstract class Shape{
    double length ;
    double width;
    double r ;
    abstract public void perimeter();
    abstract public void area();
    }



//子类输出长方形的周长和面积
class Rect extends Shape {
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

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

////子类输出圆的周长和面积
class Circle extends Shape {
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

    public Circle( double r) {
        this.r = r;
    }
}

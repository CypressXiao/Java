package day4_1;

import java.text.DecimalFormat;

public class AbstractDemo2_03 {
    public static void main(String[] args) {
        getShape2(new Rect2());
        getShape2(new Circle2());

    }

    public static void getShape2(Shape2 s) {
        s.setLength(10);
        s.setWidth(10);
        s.setR(10);
        s.area();
        s.perimeter();
    }
}


abstract class Shape2 {
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    double length;
    double width;
    double r;

    abstract public void perimeter();

    abstract public void area();
}


//子类输出长方形的周长和面积
class Rect2 extends Shape2 {
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
class Circle2 extends Shape2 {
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
    

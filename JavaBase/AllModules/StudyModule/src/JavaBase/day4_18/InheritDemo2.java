package JavaBase.day4_18;

import java.text.DecimalFormat;

public class InheritDemo2 {
    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        c.area();
        c.perimeter();
        Rect rect = new Rect(3.2,2.3);
        rect.area();
        rect.perimeter();
    }
}


abstract class Shape{
    abstract public void area();
    abstract public void perimeter();
    DecimalFormat df = new DecimalFormat(".000");

}

class Circle extends Shape{
    public static final double PI = 3.14;
    double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("圆的面积为:"+df.format(PI*Math.pow(r,2)));
    }

    @Override
    public void perimeter() {
        System.out.println("圆的周长为:"+df.format(2*PI*r));
    }
}


class Rect extends Shape{
    double length;
    double width;

    public Rect() {
    }

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("矩形的面积为:"+df.format(length*width));
    }

    @Override
    public void perimeter() {
        System.out.println("矩形的周长为:"+df.format(2*(length+width)));

    }
}

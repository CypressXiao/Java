package day4_1;

import java.text.DecimalFormat;

public class AbstractDemo2_02 {
    public static void main(String[] args) {
        getShape1(new Rect1());
        getShape1(new Circle1());

    }
    public static void getShape1(Shape1 s){
        s.length =10;
        s.width=10;
        s.r =10;
        s.area();
        s.perimeter();
    }
}



abstract class Shape1{
    double length ;
    double width;
    double r ;
    abstract public void perimeter();
    abstract public void area();
}



//子类输出长方形的周长和面积
class Rect1 extends Shape1 {
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
class Circle1 extends Shape1 {
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

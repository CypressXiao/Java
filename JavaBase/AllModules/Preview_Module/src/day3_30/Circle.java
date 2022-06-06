package day3_30;

import java.text.DecimalFormat;

public class Circle {
    private double r;
    public double getR(){
        return r;
    }
    public  void setR(double r){
        this.r =r;
    }
    public Circle(){};
    public Circle(double r){
        this.r =r;
    }
    public void AreaPerimeter(){
        double area =Math.PI* Math.pow(r,2);
        double perimeter =2*Math.PI*r;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.printf("圆的周长为:%s\n",df.format(perimeter));
        System.out.printf("圆的面积为:%s\n",df.format(area));

    }

}

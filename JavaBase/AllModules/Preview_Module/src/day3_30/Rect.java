package day3_30;

import java.text.DecimalFormat;

public class Rect {
    double height;
    double width;
    public Rect(double height,double width){
        this.height =height;
        this.width =width;
    }
    public Rect(){
        height = 10;
        width = 10;
    }
    public void Area(){
        double area = height*width;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("矩形的面积为:"+df.format(area));
    }
    public void Perimeter(){
        double perimeter =(height+width)*2;
        DecimalFormat df1 = new DecimalFormat(".00");
        System.out.println("矩形的周长为:"+df1.format(perimeter));
    }


    public static void main(String[] args) {
        Rect r1 =new Rect();
        r1.Area();
        r1.Perimeter();

        Rect r2 = new Rect(10.236,3.53);
        r2.Area();
        r2.Perimeter();

        PlainRect pr = new PlainRect(10,10,20,10);
        boolean result =pr.isInside(25.5,13);
        if(result){
            System.out.println("该点在矩形内");
        }else{
            System.out.println("该点不在矩形内");
        }
    }
}

class PlainRect extends Rect {
    double startX;
    double startY;

    public PlainRect(double startX, double startY, double height, double width) {
        this.startX = startX;
        this.startY = startY;
        this.height = height;
        this.width = width;
    }
    public PlainRect(){
        startX =0;
        startY =0;
        height =0;
        width = 0;
    }
    public boolean isInside(double x,double y){
        if(x>=startX && x<=startX+width && y<=startY && y>= startY-height){
            return true;
        }else{
            return false;
        }
    }
}

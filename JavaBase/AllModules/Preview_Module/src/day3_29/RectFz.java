package day3_29;

public class RectFz {
    private double length;
    private double width;
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double Circumference(){
        return getLength()*2+getWidth()*2;
    }
    public double Area(){
        return getLength()*getWidth();
    }
    public RectFz(){};
    public RectFz(double length,double width){
        this.length =length;
        this.width =width;
    }
    public void show(){
        System.out.printf("长方形的周长为:%.2f\n",length*2+width*2);
        System.out.printf("长方形的面积为:%.2f\n",length*width);
    }
}

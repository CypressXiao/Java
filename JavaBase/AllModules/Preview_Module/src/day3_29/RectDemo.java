package day3_29;

public class RectDemo {
    public static void main(String[] args) {
        RectFz rect1 =new RectFz();
        rect1.setLength(10.34);
        rect1.setWidth(8.24);
        System.out.printf("长方形1的周长为:%.2f\n",rect1.Circumference());
        System.out.printf("长方形1的面积为:%.2f\n",rect1.Area());

        RectFz rect2 =new RectFz();
        rect2.setLength(7.93);
        rect2.setWidth(5.27);
        System.out.printf("长方形2的周长为:%.2f\n",rect2.Circumference());
        System.out.printf("长方形2的面积为:%.2f\n",rect2.Area());

        RectFz rect3 =new RectFz(23.43,12.762);
        rect3.show();
    }
}

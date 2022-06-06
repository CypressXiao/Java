package JavaBase.day4_6;

import java.util.Scanner;

public class ClassDemo2 {
    public static void main(String[] args) {
        Cat1[] cats = new Cat1[3];
        for(int i =0;i<cats.length;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"只小猫的毛色为:");
            String furColor =sc.next();
            System.out.println("请输入第"+(i+1)+"只小猫的品种为:");
            String variety =sc.next();
            System.out.println("请输入第"+(i+1)+"只小猫的价格为:");
            double price =sc.nextDouble();
            System.out.println("---------------------------------");

            Cat1 cat =new Cat1();
            cat.furColor = furColor;
            cat.variety =variety;
            cat.price = price;

            cats[i] = cat;
        }
        for(Cat1 cat:cats){
            System.out.println("Cat{"+"毛色:"+cat.furColor+",品种:"+cat.variety+",价格:"+cat.price+"}");
        }
    }
}

class Cat1{

    String furColor;
    String variety;
    double price;

}

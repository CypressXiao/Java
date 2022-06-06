package JavaBase.day4_6;

import java.util.Scanner;

public class ClassDemo1 {
    public static void main(String[] args) {
        //创建3个猫类的对象,猫类有毛色,品种,价格三个属性,通过键盘录入每个猫的属性,然后存入到一个数组中
        Cat[] cats = new Cat[3];
        for(int i=0;i<cats.length;i++){
            cats[i] =getInput(new Cat(),i+1);
        }
        for (Cat cat : cats) {
            getInfo(cat);
        }
    }

    public static Cat getInput(Cat cat,int a){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第"+a+"只猫的毛色:");
        cat.furColor =sc.next();
        System.out.println("请输入第"+a+"只猫的品种:");
        cat.variety =sc.next();
        System.out.println("请输入第"+a+"只猫的价格:");
        cat.price =sc.nextInt();
        System.out.println("---------------------------");
        return cat;
    }

    public static void getInfo(Cat cat){
        System.out.println("Cat{"+"毛色:"+cat.furColor+",品种:"+cat.variety+",价格:"+cat.price+"}");
    }

}

class Cat{

    String furColor;
    String variety;
    double price;

}


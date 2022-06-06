package JavaBase.day4_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //创建3个猫类的对象,猫类有毛色,品种,价格三个属性,通过键盘录入每个猫的属性,然后存入到一个数组中
        ArrayList<Cat2> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Cat2 cat =new Cat2();
            list.add(getInput(cat, i + 1));
        }
        System.out.println(list);
    }


    public static Cat2 getInput(Cat2 cat, int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第" + a + "只猫的毛色:");
        cat.furColor = sc.next();
        System.out.println("请输入第" + a + "只猫的品种:");
        cat.variety = sc.next();
        System.out.println("请输入第" + a + "只猫的价格:");
        cat.price = sc.nextInt();
        System.out.println("---------------------------");
        return cat;
    }
}


class Cat2{

    @Override
    public String toString() {
        return "Cat2{" +
                "furColor='" + furColor + '\'' +
                ", variety='" + variety + '\'' +
                ", price=" + price +
                '}';
    }

    String furColor;
    String variety;
    double price;

}


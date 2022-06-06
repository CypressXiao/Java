package day3_23;/*
public class day3_23.DoubleCircleDemo1 {
    public static void main(String[] args) {
        for(int i =0;i<4;i++){
            for(int j =0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

public class DoubleCircleDemo1{
    public static void main(String[] args) {
        for(int i =0;i<5;i++){
            for(int j =0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
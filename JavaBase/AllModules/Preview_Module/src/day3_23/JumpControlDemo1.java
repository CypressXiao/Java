package day3_23;/*
public class day3_23.JumpControlDemo1 {
    public static void main(String[] args) {
        for(int i =1;i<=10;i++){
            if(i%3 == 0){
                System.out.println("java基础班");
            }
            System.out.println("java基础班");
        }
    }
}
*/

public class JumpControlDemo1 {
    public static void main(String[] args) {
        int day = 0;
        int total = 0;
        while (true) {
            day++;
            total += 3;
            if (day % 6 == 0) {
                total -= 5;
            }
            if (total >= 100) {
                break;
            }

        }
        System.out.println(day);
    }
}
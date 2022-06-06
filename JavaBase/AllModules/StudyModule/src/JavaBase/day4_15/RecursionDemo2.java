package JavaBase.day4_15;

public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(getNum(1));
    }

    public static int getNum(int day){
        if(day ==10){
            return 1;
        }else {
            return (1 + getNum(day + 1)) * 2;
        }
    }
}

package JavaBase.day4_22;

public class ChangableDemo {
    public static void main(String[] args) {
        System.out.println(getSum("Cypress",20,30,40));
    }

    public static int getSum(String name,int...a){
        System.out.println(name);
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }
}

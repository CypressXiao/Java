package day4_4;

public class DiGuiSuanFa {
    //递归算法
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    public static int getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);

        }
    }
}

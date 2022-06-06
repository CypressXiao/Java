package JavaBase.day5_2;

import java.util.function.Supplier;//返回指定泛型的一个对象

public class FunctionalInterfaceDemo1 {
    public static void main(String[] args) {
        int[] arr = { 23,1, 42, 235, 435, 654};

        printMax(() -> {
            int max = arr[0];
            for (int value : arr) {
                if (max < value) {
                    max = value;
                }
            }
            return max;
        });

        int num = printMin(() -> {
            int min = arr[0];
            for (int value : arr) {
                if (min > value) {
                    min = value;
                }
            }
            return min;
        });
        System.out.println("最小值为"+num);

    }

    public static void printMax(Supplier<Integer> s) {
        int max = s.get();
        System.out.println("最大值为"+max);
    }

    public static int printMin(Supplier<Integer> s) {
        return s.get();
    }
}

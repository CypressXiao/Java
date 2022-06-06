package day4_21;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,7,5,3,5,42,74,99};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}

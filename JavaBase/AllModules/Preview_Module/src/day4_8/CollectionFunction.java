package day4_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionFunction {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,3,4,7,9,2);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int a = Collections.binarySearch(list,2);//只能针对升序排序
        System.out.println(a);

        int b = Collections.max(list);
        System.out.println(b);


    }
}

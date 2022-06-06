package JavaBase.day4_3;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    //生成20个不同的随机数,并将其存入数组
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[20];
        A:while (count < arr.length) {
            Random ran = new Random();
            int ran1 = ran.nextInt(21);
            for(int i:arr){
                if(ran1 ==i){
                    continue A;
                }
            }
            arr[count] = ran1;
            count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

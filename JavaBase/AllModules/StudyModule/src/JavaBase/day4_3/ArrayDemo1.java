package JavaBase.day4_3;

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //获取数组当中的某个元素
        int[] scores= new int[]{98,99,100,80,89,84,78,56,82,96};
        System.out.println(scores[2]);


        //遍历打印
        for (int i : scores) {
            System.out.print(i + " ");
        }

        //求想要值对应的索引值
        for(int i =0;i<scores.length;i++){
            if(56 == scores[i]){
                System.out.println(i);
            }
        }

        Random ran = new Random();
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = ran.nextInt(101);
            System.out.print(arr[i]+" ");
        }


        /*int a =scores.length;
        System.out.println(a);
        System.out.println(Arrays.toString(scores));*/
    }
}

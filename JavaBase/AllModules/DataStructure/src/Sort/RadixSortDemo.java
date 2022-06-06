package Sort;

import java.util.Arrays;

/**
 * @ClassName RadixSort
 * @Description 基数排序
 * @Author 肖榆柏
 * @Date 2022/5/13 7:22
 * @Version 1.0
 */

public class RadixSortDemo {
    public static void main(String[] args) {
        int[] arr ={-11,-34,23,2452,423,4521};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr){
        //先创建10个桶
        int[] arr1 = new int[arr.length];
        int[][] buckets = new int[10][arr.length];
        //创建一个统计每个桶中数个数的数组
        int[] num = new int[10];
        //找到数组中最小的数
        int min =0;
        for (int i : arr) {
            if(i<min){
                min=i;
            }
        }
        //每个数减去最小的数,然后得到最大数的长度
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i]-min;
            if(arr1[i]>max){
                max=arr1[i];
            }
        }

        //得到最长的长度
        int maxLen =(max+"").length();

        for (int k =0,n=1;k<maxLen;k++,n*=10) {
            //开始进行装桶
            for(int i=0;i<arr1.length;i++){
                int num1 =arr1[i]/n%10;
                buckets[num1][num[num1]] =arr1[i];
                num[num1]++;
            }
            //开始取桶
            int index =0;
            for (int i = 0; i < num.length; i++) {
                if(num[i]!=0){
                    for(int j =0;j<num[i];j++)
                        arr1[index++]=buckets[i][j];
                }
                //取完后把个数置为0,但桶中元素还在
                num[i]=0;
            }
            for (int i = 0; i < arr1.length; i++) {
                arr[i]=arr1[i]+min;
            }
        }
    }
}

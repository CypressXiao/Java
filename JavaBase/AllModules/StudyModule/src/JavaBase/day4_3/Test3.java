package JavaBase.day4_3;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {12, 20, 15, 26, 29,16, 18,22, 50};
        int[] arr1 =getOrderFromMin(arr);// 从小到大排序
        //Arrays.sort(arr); --->从小到大的快捷方式
        //int[] arr2 =getOrderFromMax(arr); // 从大到小排序
        //Arrays.sort(arr, Collections.reverseOrder());  //--->从大到小排序的快捷方式

        /*下列方式的快捷方式为:Arrays.binarySearch(数组名,要查找的值);--->默认查找第一个值所在的位置,
         查找相同元素的不同位置课考虑嵌套*/
        int min =0;
        int max =arr1.length-1;
        System.out.println("请输入要查找的值:");
        Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        while(min<=max){
            int mid =(min+max)/2; //等价于(min/max)>>>1
            if(arr1[mid]>numb1){
                max =mid-1;
            }else if(arr1[mid]<numb1){
                min = mid+1;
            }else{
                System.out.println(numb1+"所在的位置索引值为:"+mid);
                break;
            }
        }
    }
    //选择排序的方法(从小到大)
    public static int[] getOrderFromMin(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    //冒泡排序的方法(从大到小)
    public static int[] getOrderFromMax(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

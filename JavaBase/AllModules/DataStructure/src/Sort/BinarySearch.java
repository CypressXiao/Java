package Sort;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/13 8:27
 * @Version 1.0
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,234,4546,14,14,14,14,-133,-54};
        RadixSortDemo.radixSort(arr);
        System.out.println(Arrays.toString(arr));
        final ArrayList<Integer> list = binarySearch(arr, 0, arr.length - 1, 14);
        System.out.println(list);
    }
    public static ArrayList<Integer> binarySearch(int[] arr,int left,int right,int num){
        int index =0;
        ArrayList<Integer> list = new ArrayList<>();
        while (left<=right) {
            /*int mid =(left+right)>>1;*/
            int mid =left+(right-left)*(num - arr[left])/(arr[right]-arr[left]);
            if(arr[mid]>num){
                right = mid-1;
            }else if(arr[mid]<num){
                left =mid+1;
            }else if(arr[mid]==num){
                index = mid;
                break;
            }else {
                list.add(-1);
                return list;
            }
        }
        while(index >=left && arr[index] ==num){
            index--;
        }
        while(index<right && arr[index+1]==num){
            list.add(index+1);
            index++;
        }
        return list;
    }
}

package Algorithm;

/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/21 8:00
 * @Version 1.0
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 7, 13, 54, 64, 73, 204};
        System.out.println(binarySearch1(arr, 0, arr.length - 1, 54));

    }

    //采用递归的方式进行查找
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        } else {
            return binarySearch(arr, mid + 1, right, target);
        }
    }

    //采用非递归的方式
    public static int binarySearch1(int[] arr,int left,int right,int target){
        while(left<right){
            int mid = (left+right)>>1;
            if(arr[mid]>target){
                right = mid -1;
            }else if(arr[mid]<target){
                left =mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

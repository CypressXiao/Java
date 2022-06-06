package JavaBase.day4_15;

import java.util.Arrays;

public class Test {
    /**
     * 数组中存储n个元素,将指定索引处的元素删除,并将后面的元素依次进1,将最后的一个元素置为null值
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArr(10,2)));
    }

    public static String[] getArr(int n,int index){
        String[] arr = new String[n];
        for (int i = 1; i <= n; i++) {
            arr[i-1] =i+"";
        }
        System.arraycopy(arr,index+1,arr,index,n-index-1);
        arr[n-1] = null;
        return arr;
    }
}

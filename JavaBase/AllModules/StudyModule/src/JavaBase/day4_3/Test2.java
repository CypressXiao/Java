package JavaBase.day4_3;

import java.util.Scanner;

public class Test2 {

    //查找数组中某个值得索引值(含重复的情况)
    public static void main(String[] args) {
        System.out.println("请输入要查找的数字:");
        Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        int[] arr ={5,1,3,4,5,3,7,5,8,2};
        int count = 0;
        System.out.println("请输入要查找第几个值:");
        int times =sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] ==numb1){
                count++;
                if(count ==times){
                    System.out.println("第"+count+"个"+numb1+"所在的索引值为:"+i);
                }
            }
        }
    }
}

package Quene8;

public class Queen8Demo {
    int max = 8;
    //创建一个容量为8的数组,数组的位置i代表第(i+1)个皇后(即行),(数组中的值+1)代表对应皇后所在列
    int[] arr = new int[max];
    //递归加回溯算法(回溯往往要用到返回值是boolean的递归方法)
    static int count = 0;
    static int judgeCount = 0;
    public static void main(String[] args) {
        final Queen8Demo q8 = new Queen8Demo();
        q8.findWays(0);
        System.out.println("共有"+count+"种方法");
        System.out.println("共判断"+judgeCount+"次");

    }
    //创建一个寻找路线的方法
    private void findWays(int n){
        if(n == max){
           print();
           return;
        }
        for(int i =0;i<max;i++){
            arr[n] = i;
            if(judge(n)){
                findWays(n+1);
            }
        }
    }

    //创建一个检测第n个皇后放置是否冲突的方法
    private boolean judge(int n){
        for(int i =0;i<n;i++){
            judgeCount++;
            //如果皇后位置相同或者在对角线则返回false
            if(arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n]-arr[i])){
                return false;
            }
        }
        return true;
    }

    //创建一个打印数组的方法
    private void print(){
        count++;
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

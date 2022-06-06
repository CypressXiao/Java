package JavaBase.day4_7;

import java.util.HashMap;
import java.util.Map;

public class test5 {
    public static void main(String[] args) {
        int a = new Demo().climbStairs(10);
    }
}

class Demo{
    Map<Integer,Integer> map =new HashMap<>();
    public int climbStairs(int n) {
        //转化成斐波那契数列
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(null !=map.get(n)){
            return map.get(n);
        }
        else{
            int a =climbStairs(n-1)+climbStairs(n-2);
            map.put(n,a);
            return a;
        }
    }
}

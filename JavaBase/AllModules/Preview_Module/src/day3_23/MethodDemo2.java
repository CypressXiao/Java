package day3_23;

public class MethodDemo2 {
    public static void main(String[] args) {
        /*double a1 = printAreaOfCircle(3);
        System.out.println("s="+a1);
        System.out.println("两数之和为："+getSum(502.4,403.245));*/
        boolean a3 = getNum(5);
    }
    public static double printAreaOfCircle(double r){
        return Math.PI*Math.pow(r,2);
    }
    public static double getSum(double x,double y){
       return (x+y);
    }
    public static boolean getNum(int x){
        if(x%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}

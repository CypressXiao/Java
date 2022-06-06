package day3_23;

public class MethodDemo1 {
    public static void main(String[] args) {
       /* numbSum(12.4,12.1);
        banJin(2.5);*/
        num(3,4);
    }
    public static void numbSum(double a,double b){
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.printf("%.2f-%.2f=%.2f",a,b,(a-b));
        System.out.println();
    }
    public static void banJin(double r){
        System.out.printf("圆的周长为：%.2f\n",2*Math.PI*r);
        System.out.printf("圆的面积为：%.2f\n",Math.PI*Math.pow(r,2));
    }
    public static void num(int a,int b){
        for(int i =1;i<=a;i++){
            for(int j =1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

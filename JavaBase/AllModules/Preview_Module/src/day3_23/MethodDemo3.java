package day3_23;

public class MethodDemo3 {
    public static void main(String[] args) {
        double a1 = getMinus(53.23,34.783);
        System.out.println("两数之差为"+a1);
        double a2 =getMax(10.3f,19.5f,13.64f);
        System.out.println(a2);

    }
    public static double getMinus(double x,double y){
        return (x-y);
    }
    public static float getMax(float x,float y,float z){
        float max1 = x>y?(x>z?x:z):(y>z?y:z);
        return max1;
    }
}

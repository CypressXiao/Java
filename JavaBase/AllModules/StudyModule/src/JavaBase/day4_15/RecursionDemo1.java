package JavaBase.day4_15;

public class RecursionDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(12));
        System.out.println(getSum1(12));
    }

    public static int getSum(int num){
        if(num == 1 || num ==2){
            return 1;
        }else{
            return getSum(num-1)+getSum(num-2);
        }
    }

    public static int getSum1(int num){
        int numb1 =1;
        int numb2 =1;
        for(int i=0;i<num-2;i++){
            int temp = numb2;
            numb2 += numb1;
            numb1 = temp;
        }
        return numb2;
    }
}

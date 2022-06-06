package day3_23;

public class NineNineXTableDemo1 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j =1;j<=i;j++){
                /*System.out.printf("%dx%d=%d",j,i,(i*j));*/
                System.out.print(j+"x"+i+"="+i*j);
              /*  System.out.print(j);
                System.out.print("x");
                System.out.print(i);
                System.out.print("=");
                System.out.print((i*j));*/
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

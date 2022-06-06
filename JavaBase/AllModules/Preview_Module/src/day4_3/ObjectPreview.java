package day4_3;

public class ObjectPreview {
    public static void main(String[] args) {
        OneToN a1 = new Sum();
        System.out.println(a1.dispose(10));
        OneToN a2 = new Pro();
        System.out.println(a2.dispose(5));

        //匿名内部类
        int total1 = new OneToN() {
            @Override
            public int dispose(int n) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                return sum;
            }
        }.dispose(10);
        System.out.println(total1);

        int total2 = new OneToN(){
            @Override
            public int dispose(int n) {
                int product =1;
                for(int k =1;k<=n;k++){
                    product *=k;
                }
                return product;
            }
        }.dispose(5);
        System.out.println(total2);
    }
}

interface OneToN {
    abstract public int dispose(int n);
}

class Sum implements OneToN {
    @Override
    public int dispose(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

class Pro implements OneToN {
    @Override
    public int dispose(int n) {
        int pro = 1;
        for (int j = 1; j <= n; j++) {
            pro *= j;
        }
        return pro;
    }
}
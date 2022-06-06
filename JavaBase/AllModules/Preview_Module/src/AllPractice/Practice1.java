package AllPractice;

import java.util.Scanner;

public class Practice1 {
    //1.有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("该月份的兔子的对数为:"+numb(month));
    }
    public static int numb(int a){
        if(a == 1 || a ==2){
            return 1;
        }else{
            return(numb(a-1)+numb(a-2));
        }
    }*/

    //2.判断101-200之间有多少个素数，并输出所有素数。

    /*public static void main(String[] args) {
        for(int i =101;i<=200;i++){
            int count = 0;
            for(int j =1;j<=i;j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }
        }
    }*/

   /* 3.打印出所有的”水仙花数”，所谓”水仙花数”是指一个三位数， 其各位数字立方和等于该数本身。
     例如：153是一个”水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方。*/

    /*public static void main(String[] args) {
        for(int i =100;i<=999;i++){
            int num =i;
            int total =0;
            while(num>0){
                int a = num%10;
                total += (int) Math.pow(a,3);
                num /=10;
            }
            if(total == i){
                System.out.println(i);
            }
        }
        for(int i =100;i<=999;i++){
            int a = i%10; //个位数
            int b =(i/10)%10; //十位数
            int c =i/100;//百位数
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }*/

    // 4.将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int numb = sc.nextInt();
        System.out.print(numb+"=");
        for(int i =2;i<=numb/2;i++){
            if(numb%i == 0 ){
                System.out.print(i+"*");
                numb /=i;
                i=2;
            }
        }
        System.out.println(numb+"*"+1);
    }*/

    //5.利用条件运算符的嵌套来完成此题： 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int grade = sc.nextInt();
        if(grade >=90){
            System.out.println("成绩等级为:A");
        }else if(grade >=60){
            System.out.println("成绩等级为:B");
        }else{
            System.out.println("成绩等级为:C");
        }
    }*/

    //6.输入两个正整数m和n，求其最大公约数和最小公倍数。
    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int m = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int n = sc.nextInt();
        int min = Math.min(m, n);
        int max =0;
        for(int i =1;i<=min;i++){
            if(m%i == 0 && n%i ==0 && max <i){
                max =i;
            }
        }
        System.out.println("最大公约数为"+max);
        for(int j =min;j<=(m*n);j++){
            if(j%n ==0 && j%m ==0){
                System.out.println("最小公倍数为"+j);
                break;
            }
        }
    }*/

    //7.输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
    /*public static void main(String[] args) {
        //String str = "1w2e3r4t $  5^&RwFde";
        System.out.println("请输入一行字符:");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int a =0,b=0,c=0,d=0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)>='a' & str.charAt(i)<='z') | (str.charAt(i)>='A' & str.charAt(i) <='Z')){
                a++;
            }else if(str.charAt(i)>='0' &str.charAt(i)<='9'){
                b++;
            }else if(str.charAt(i)==' '){
                c++;
            }else{
                d++;
            }
        }
        System.out.println("英文字母的个数为:"+a);
        System.out.println("数字的个数为:"+b);
        System.out.println("空格的个数为:"+c);
        System.out.println("其他字符的个数为:"+d);
    }*/

    //求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。 例如2+22+222+2222+22222(此时共有5个数相加)， 几个数相加有键盘控制。
    /*public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入要想加的数的个数:");
        int numb =sc.nextInt();
        System.out.println("请输入一个数字(1-9):");
        int numb1 =sc.nextInt();
        int numb2 = 0;
        int s = 0;
        for(int i=0;i<numb;i++){
            numb2 +=numb1*(int)Math.pow(10,i);
            if(i==0){
                System.out.print("s="+numb2);
            }else {
                System.out.print( "+" +numb2);
            }
            s +=numb2;
        }
        System.out.println("="+s);
    }*/

    //8.一个数如果恰好等于它的因子之和， 这个数就称为”完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
    /*public static void main(String[] args) {
        int sum =0;
        for(int i=2;i<1000;i++){
            for(int j=1;j<i;j++){
                if(i%j ==0 ){
                    sum +=j;
                }
            }
            if(i==sum){
                    System.out.println(i);
                }
                sum = 0;
        }
    }*/

    //9.一球从h米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？

/*    public static void main(String[] args) {
        DecimalFormat df =new DecimalFormat(".000");//保留三位小数,这只是练习,运用是不用这么写
        System.out.println("请输入落地高度:");
        Scanner sc =new Scanner(System.in);
        double height = sc.nextInt();
        System.out.println("请输入落地次数:");
        int n =sc.nextInt();
        double sum =0.0;
        for(int i =1;i<=n;i++){
            if(i ==1){
                sum += height;
                if(n==1){
                    System.out.printf("第%d次反弹高度为%s,第%d次落地时共经历%s米",n,df.format(height),n,df.format(sum));
                    break;
                }
            }else{
                height /=2;
                sum +=(height*2);
            }
        }
        System.out.printf("第%d次反弹高度为%s,第%d次落地时共经历%s米",n,df.format(height),n,df.format(sum));
    }*/

    //10.有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

    /*public static void main(String[] args) {
        int count =0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i == j | i == k | j == k) {
                        continue;
                    } else{
                        System.out.printf("%d%d%d ",i,j,k);
                        count++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }*/

    /*11.企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
        利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
        20万到40万之间时，高于20万元的部分，可提成5%；
        40万到60万之间时高于40万元的部分，可提成3%；
        60万到100万之间时，高于60万元的部分，可提成1.5%，
        高于100万元时，超过100万元的部分按1%提成， 从键盘输入当月利润I，求应发放奖金总数？*/

    /*public static void main(String[] args) {
        double profit =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当月利润");
        double money =sc.nextInt();
        if(money <=100000){
            profit = money*0.1;
        }else if(money<=200000){
            profit = 10000+(money-100000)*0.075;
        }else if(money<=400000){
            profit = 17500+(money-200000)*0.05;
        }else if(money<=600000){
            profit = 27500+(money-400000)*0.03;
        }else if(money<=1000000){
            profit = 33500+(money-600000)*0.015;
        }else{
            profit = 39500+(money-1000000)*0.01;
        }
        System.out.println("奖金总额为:"+profit);
    }*/

    /*12.一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
    （完全平方数：一个数=另一个数的平方，如121=11^11）。*/
    /*public static void main(String[] args) {
        for (int i = 0; i <= 10000; i++) {
            for (int j = 0; j <= 1000; j++) {
                if (j * j == (i + 100)) {
                    for (int k = 0; k <= 1000; k++)
                        if (k * k == (i + 268))
                            System.out.println(i);
                }
            }
        }
    }*/

    //13.输入某年某月某日，判断这一天是这一年的第几天？

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入年份:");
        int year =sc.nextInt();
        System.out.println("请输入月份:");
        int mon =sc.nextInt();
        System.out.println("请输入天:");
        int day =sc.nextInt();
        getDays(year,mon,day);


    }

    public static void getDays(int a,int b,int c){
        int[] arr;
        int sumDay =0;
        int[] arr1 =new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int[] arr2=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        if((a%100 !=0 && a%4 ==0) | a%400 ==0){
             arr =arr2;
        }else{
            arr =arr1;
        }
        for(int i=0;i<b-1;i++){
            sumDay +=arr[i];
        }
        sumDay += c;
        System.out.println("这一天是第"+sumDay+"天");
    }

}


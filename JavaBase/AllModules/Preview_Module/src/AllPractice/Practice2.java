package AllPractice;

public class Practice2 {
    //14.输入三个整数x,y,z，请把这三个数由小到大输出。
    /*public static void main(String[] args) {
        System.out.println("请输入整数x:");
        Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        System.out.println("请输入整数y:");
        int numb2 =sc.nextInt();
        System.out.println("请输入整数z:");
        int numb3 =sc.nextInt();
        int[] arr = new int[]{numb1,numb2,numb3};
        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] = temp;
                }
            }
        }for(int k =0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }*/

    /*15.两个乒乓球队进行比赛，甲队派出a，b，c；乙队派出x，y，z三人，已抽签决定比赛名单，
    打听到a说他不和x比，c说他不和x，z比，请编程找出三队赛手的名单。(第一次不会做)*/

    /*public static void main(String[] args) {
        String a = null, b = null, c = null;// 甲队成员
        String[] racer = {"x", "y", "z"};// 乙队成员
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && i != k && j != k) {
                        a = racer[i];
                        b = racer[j];
                        c = racer[k];
                        if (!a.equals("x") && !c.equals("z") && !c.equals("x")) {
                            System.out.println("a的对手是：" + racer[i] +
                            "，\nb的对手是：" + racer[j] + "，\nc的对手是：" + racer[k]);
                        }
                    }
                }
            }
        }
    }*/


    /**
     * 16.
     *
     * @author mahanyuan 题目：打印出如下图案（菱形）：
     * *
     * ***
     * *****
     * *******
     * *****
     * ***
     * *
     */
    /*public static void main(String[] args) {
        System.out.println("请输入打印行数(奇数):");
        Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        for(int i=0;i<=numb1/2;i++){
                for(int j =i;j<numb1/2;j++){
                    System.out.print(" ");
                }
                for(int k =0;k<2*i+1;k++){
                    System.out.print("*");
                }
                System.out.println();
        }
        for(int m =0;m<numb1/2;m++){
            for(int n=0;n<=m;n++){
                System.out.print(" ");
            }
            for(int p =2*(m+1);p<numb1;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        }*/

    //有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13… 求出这个数列的前20项之和
    /*public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (fun1(i) /fun2(i));
        }
        System.out.println(sum);
    }

    public static double fun1(double a) {
        if (a == 1) {
            return 2;
        } else if (a == 2) {
            return 3;
        } else {
            return fun1(a - 2) + fun1(a - 1);
        }
    }
    public static double fun2(double b){
        if(b==1){
            return 1;
        }else if(b==2){
            return 2;
        }else{
            return fun2(b-2)+fun2(b-1);
        }
    }*/

    //17.求1+2!+3!+…+20!的和。
    /*public static void main(String[] args) {
        int sum =0;
        for(int i=1;i<=20;i++){
            sum +=getMulti(i);
        }
        System.out.println("1+2!+3!+…+20!"+"="+sum);
    }
    public static int getMulti(int a){
        if(a==1){
            return 1;
        }else{
            return a*getMulti(a-1);
        }
    }*/

    /*18.有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
    问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁 。
    问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？
     */
   /* public static void main(String[] args) {
        System.out.println("第五个人的年龄为:"+getAge(5));
    }
    public static int getAge(int a){
        if(a== 1){
            return 10;
        }else{
            return 2+getAge(a-1);
        }
    }*/

    //19.给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
    /*public static void main(String[] args) {
        System.out.println("请输入一个不多于5位数的正整数:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str+"是"+str.length()+"位数");
        for (int i=0;i<str.length();i++){
            System.out.println("第"+(i+1)+"位数字为"+str.charAt(i));
        }
    }*/

    //20.输入一个数，判断是否为回文数 如123321， 12321等
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0,j =str.length()-1;i<=j;i++,j--){
            if(str.charAt(i) == str.charAt(j)){
                if(count == (str.length()-1)/2){
                    System.out.println(str+"是一个回文数");
                }
                count++;
            }else{
                System.out.println(str+"不是一个回文数");
            }
        }
    }*/

    //21.请输入星期几的第一个字母来判断一下是星期几， 如果第一个字母一样，则继续判断第二个字母。
    /*public static void main(String[] args) {
        System.out.println("请输入第一个字母:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "M":
                System.out.println("星期一");
                break;
            case "T":
                System.out.println("请输入第二个字母:");
                String str1 = sc.nextLine();
                switch (str1) {
                    case "u":
                        System.out.println("星期二");
                        break;
                    case "h":
                        System.out.println("星期四");
                        break;
                }
                break;
            case "W":
                System.out.println("星期三");
                break;
            case "F":
                System.out.println("星期五");
                break;
            case "S":
                System.out.println("请输入第二个字母:");
                String str2 = sc.nextLine();
                switch (str2) {
                    case "u":
                        System.out.println("星期日");
                        break;
                    case "a":
                        System.out.println("星期六");
                        break;
                }
                break;
            default:
                System.out.println("输入的字母不合法!");
                break;
        }

    }*/

    //22.求100以内的素数
    /*public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            boolean flag =true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag =false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }*/

    //23.对10个数进行排序。
    /*public static void main(String[] args) {
        int[] arr =new int[]{1,31,2,43,56,23,73,48,91,46};
        choseGetSequence(arr);
    }*/

    //24.有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
   /* public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,31,2,43,56,23,73,48,91,46};
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int numb1 = sc.nextInt();
        Arrays.sort(arr);//数组排序
        List<Integer> list =Arrays.asList(arr);//数组转集合,但是不能引用
        List<Integer> list1 =new ArrayList<>(list);//创建新集合接收转换后的集合,再进行操作
        for(int i=0;i<list1.size();i++){
            if( list1.get(i)>=numb1){
                list1.add(i,numb1);
                break;
            }else if(i == list1.size()-1){
                list1.add(numb1);
                break;
            }
        }
        Object[] o = list1.toArray();
        System.out.println(Arrays.toString(o));
    }*/

    //25.将一个数组逆序输出。
    /*public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,31,2,43,56,23,73,48,91,46};
        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        int[] arr1 =new int[]{1,31,2,43,56,23,73,48,91,46};
        for(int i=0;i<arr1.length-1;i++){
            for(int j =i+1;j<arr1.length;j++){
                if(arr1[i]<arr1[j]){
                    int temp =arr1[j];
                    arr1[j] =arr1[i];
                    arr1[i] =temp;
                }
            }
            System.out.print(arr1[i]+" ");
        }
    }*/

    //26.取一个整数a从右端开始的4～7位。
   /* public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        Integer numb1 = sc.nextInt();
        String str = String.valueOf(numb1);
        if(str.length()<7){
            System.out.println("输入的整数不合法!");
        }else{
            StringBuilder str1 = new StringBuilder();
            for(int i=str.length()-1;i>=0;i--){
                str1.append(str.charAt(i));
            }
            System.out.println(str1);
            String s =str1.substring(3,7);
            System.out.println(s);
        }
    }*/

    //27.
    /**
     * 题目：打印出杨辉三角形（要求打印出10行如下图）
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     * 1 5 10 10 5 1
     * 1 6 15 20 15 6 1
     * 1 7 21 35 35 21 7 1
     * 1 8 28 56 70 56 28 8 1
     * 1 9 36 84 126 126 84 36 9 1
     * ————————————————
     */


    /**
     * @author mahanyuan
     * 题目：打印出杨辉三角形（要求打印出10行如下图）
     */
    public static void main(String[] args) {
        int[][] arr = new int[10][10]; // 定义一个二维数组
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if (i >= 2 && j > 0) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                // 控制最左列和斜边为1
                arr[i][0] = 1;
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




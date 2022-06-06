package JavaBase.day3_28;


public class FormatTest
{
    public static void main(String[] args)   {
        int number1 = 5;
        int number2 = 0;
        int number3 = -12;
        System.out.println("\n------------------  方法 1  ------------\n");
        java.text.DecimalFormat format = new java.text.DecimalFormat("0000");
        System.out.println(format.format(number1));
        System.out.println(format.format(number2));
        System.out.println(format.format(number3));

        System.out.println("\n------------------  方法 2  ------------\n");
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        String str1 = String.format("%04d", number1);
        String str2 = String.format("%04d", number2);
        String str3 = String.format("%04d", number3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
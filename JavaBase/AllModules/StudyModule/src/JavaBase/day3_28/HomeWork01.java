package JavaBase.day3_28;

/*
public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println("水果编号\t水果名称\t水果单价\t计价单位\t品质");
        System.out.println("1\t\t榴莲\t\t32.0\t公斤\t\tA");
        System.out.println("2\t\t苹果\t\t6.5\t\t公斤\t\tB");
        System.out.println("3\t\t猕猴桃\t6.0\t\t公斤\t\tA");
        System.out.println();
        System.out.println("水果编号\t水果名称\t水果单价\t计价单位\t品质");
        System.out.println(1+"\t\t榴莲\t\t"+32.0+"\t公斤\t\t"+'A');
        System.out.println(2+"\t\t苹果\t\t"+6.5+"\t\t公斤\t\t"+'B');
        System.out.println(3+"\t\t猕猴桃\t"+6.0+"\t\t公斤\t\t"+'A');
    }
}
*/

public class HomeWork01{
    public static void main(String[] args) {
        System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n","水果编号","水果名称","水果单价","计价单位","品质");
        System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n","1","榴莲","32.0","公斤","A");
        System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n","2","苹果","6.5","公斤","B");
        System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n","3","猕猴桃","6.0","公斤","A");
        System.out.println();
        System.out.printf("%-4s\t%-4s\t%-4s\t%-4s\t%-4s\n","水果编号","水果名称","水果单价","计价单位","品质");
        System.out.printf("%-4d\t%-4s\t%-4.1f\t%-4s\t%-4s\n",1,"榴莲",32.0,"公斤",'A');
        System.out.printf("%-4d\t%-4s\t%-4.1f\t%-4s\t%-4s\n",2,"苹果",6.5,"公斤",'B');
        System.out.printf("%-4d\t%-4s\t%-4.1f\t%-4s\t%-4s\n",3,"猕猴桃",6.0,"公斤",'A');
        System.out.println();
        System.out.printf("%4s\t%4s\t%4s\t%4s\t%4s\n","水果编号","水果名称","水果单价","计价单位","品质");
        System.out.printf("%4d\t%4s\t%4.1f\t%4s\t%4s\n",1,"榴莲",32.0,"公斤",'A');
        System.out.printf("%4d\t%4s\t%4.1f\t%4s\t%4s\n",2,"苹果",6.5,"公斤",'B');
        System.out.printf("%4d\t%4s\t%4.1f\t%4s\t%4s\n",3,"猕猴桃",6.0,"公斤",'A');

    }
}

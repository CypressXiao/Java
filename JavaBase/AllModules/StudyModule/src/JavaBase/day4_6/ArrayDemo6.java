package JavaBase.day4_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo6 {
    public static void main(String[] args) {
        //向集合中存储学生对象,要做到不重复
        ArrayList<Student1> a1 = new ArrayList<>();
        for(int i=0;i<3;i++){
            Student1 s = new Student1();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个同学的姓名:");
            String name =sc.next();
            System.out.println("请输入第"+(i+1)+"个同学的年龄:");
            int age =sc.nextInt();
            System.out.println("请输入第"+(i+1)+"个同学的分数:");
            double score =sc.nextDouble();
            System.out.println("---------------------------");
            s.name =name;
            s.age =age;
            s.score =score;
            if(!a1.contains(s)){
                a1.add(s);
            }
        }
        System.out.println(a1);
    }
}

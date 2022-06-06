package day3_30;

public class CodeBlockDemo {
    static int count =0;
    static{
        System.out.println("我是静态代码块");
    }
    public CodeBlockDemo(){
        System.out.println("我是无参构造方法");
    }
    {
        count++;
        System.out.println("构造代码块");
    }
    public CodeBlockDemo(int a){
        System.out.println("我是有参构造方法");
    }
    public void code(){
        {
            System.out.println("我是非静态局部代码块");
        }
    }
    public static void code1(){
        {
            System.out.println("我是静态局部代码块");
        }
    }

    public static void main(String[] args) {
        CodeBlockDemo c1 = new CodeBlockDemo();
        CodeBlockDemo c2 = new CodeBlockDemo(12);
        c1.code();
        CodeBlockDemo.code1();
        System.out.println(count++);

            }
        }


package day3_30;

public class Person {
    String name = "张三";
    public void print(){
        System.out.println(name);
    }
    public void print(String name){
        System.out.println(name);
    }
    public void print1(String name){
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        p.name ="李四";
        p.print();
        p.print("王五");
        p.print1("赵六");
    }
}

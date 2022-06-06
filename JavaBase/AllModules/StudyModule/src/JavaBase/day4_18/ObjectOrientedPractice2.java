package JavaBase.day4_18;

public class ObjectOrientedPractice2 {
    public static void main(String[] args) {
        Number numb = new Number(12,10);
        numb.addNum();
        numb.subNum();
        numb.mulNum();
        numb.divNum();
    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void addNum(){
        System.out.println(n1+n2);
    }

    public void subNum(){
        System.out.println(n1-n2);
    }

    public void mulNum(){
        System.out.println(n1*n2);
    }

    public void divNum(){
        System.out.println(1.0*n1/n2);
    }
}

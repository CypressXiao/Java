package day3_30;

public class ExtendsDemo3 {
    public static void main(String[] args) {

    }
}

class FatherClass {
    String name = "小明";

    public FatherClass() {
        super();
    }

    public FatherClass(int b) {

    }
}

class SonClass1 extends FatherClass {
    String name = "小红";

    public SonClass1() {
        super();
    }

    public SonClass1(int a) {
        this();
    }

    public SonClass1(String c) {
        super();
    }

}



class SonClass2 extends FatherClass {
    String name = "小王";

    public SonClass2() {
        super(1);
    }
}

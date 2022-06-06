package JavaBase.day4_12;

public class AnonymousClass1 {
    public static void main(String[] args) {
        new FuTest().get(new Fu(){
            @Override
            public void show() {
                System.out.println("大妈爱跳广场舞!");
            }
        });
    }
}

class Fu{
    public void show(){
        System.out.println("父类跳广场舞!");
    }
}

class FuTest{
    public void get(Fu fu){
        fu.show();
    }
}
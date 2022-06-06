package JavaBase.day4_10;

public class SimpleDesignDemo {
    public static void main(String[] args) {

        SimpleDesign s1 = SimpleDesign.getInstance();
        SimpleDesign s2 = SimpleDesign.getInstance();
        SimpleDesign s3 = SimpleDesign.getInstance();
        SimpleDesign s4 = SimpleDesign.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

class SimpleDesign{
    private static SimpleDesign s1 = new SimpleDesign();
    private SimpleDesign(){

    }
    public static SimpleDesign getInstance(){
        return s1;
    }
}



package JavaBase.day4_10;

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        Son son =new Son();
    }
}


class Son{
    final String name;
    public Son(){
        this.name = null;
    }

   /* public Son(String name){
        this.name =name;
    }*/
}

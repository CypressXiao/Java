package day4_2;;

public class InterfaceDemo3 {
    public static void main(String[] args) {
        InterfaceA A = new Print();
        A.printCapitalLetter(1);
        InterfaceB B = new Print();
        B.printLowercaseLetter(2);
    }
}

interface InterfaceA{
    public abstract void printCapitalLetter(int a);
}

interface InterfaceB{
    public abstract void printLowercaseLetter(int b);
}

class Print implements InterfaceA, InterfaceB{
    public void printCapitalLetter(int a){
        for(char i = 'A';i<='Z';i++){
            System.out.print(i);
        }
        System.out.println();
    }
    public void printLowercaseLetter(int b){
        for(char j ='a';j<='z';j++){
            System.out.print(j);
        }
        System.out.println();
    }
}


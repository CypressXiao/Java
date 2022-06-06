package JavaBase.day5_2;

import java.util.function.Consumer;

public class FunctionalInterfaceDemo4 {
    public static void main(String[] args) {
        Consumer<String> con =s -> System.out.println(s.toUpperCase());
        con.accept("good");

        printString(s-> System.out.println(s.toUpperCase()),s-> System.out.println(s.toLowerCase()));
    }
    public static void printString(Consumer<String> con1, Consumer<String> con2){
        con1.andThen(con2).accept("heLLo");
    }
}

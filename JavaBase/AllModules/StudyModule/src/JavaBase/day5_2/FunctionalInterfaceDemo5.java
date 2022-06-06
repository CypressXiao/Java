package JavaBase.day5_2;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo5 {
    public static void main(String[] args) {
        show(System.out::println);
        String s = "hellO";

        get(s::toLowerCase);

    }

    public static void show(Consumer<String> con) {
        con.accept("1234");
    }

    public static void get(Supplier<String> s) {
        System.out.println(s.get());
    }
}


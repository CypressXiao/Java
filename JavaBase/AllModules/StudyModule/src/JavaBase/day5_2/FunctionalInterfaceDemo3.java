package JavaBase.day5_2;

import java.util.function.Function;

public class FunctionalInterfaceDemo3 {
    public static void main(String[] args) {
        final Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("123"));

        final Function<String, Dog> f1 = s -> new Dog(s);
        System.out.println(f1.apply("大黄").name);
    }
}

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }
}

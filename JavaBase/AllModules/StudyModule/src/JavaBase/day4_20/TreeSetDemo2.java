package JavaBase.day4_20;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        try {
            t.add(null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println(t);
        HashSet<String> h = new HashSet<>();
        h.add(null);
        System.out.println(h);
    }
}

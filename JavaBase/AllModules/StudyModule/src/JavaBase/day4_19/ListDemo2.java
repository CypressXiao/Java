package JavaBase.day4_19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Cypress");
        list1.add("Cypress");
        list1.add("Cypress");
        list1.add("Cypress1");
        list1.add("Cypress2");
        list1.add("Cypress3");

        Iterator<String> it = list1.iterator();
        while(it.hasNext()) {
            if (it.next().equals("Cypress")) {
                it.remove();//必须用迭代器删除!!!!!
            }
        }
        System.out.println(list1);
    }
}

package JavaBase.day4_20;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",100,150,86));
        list.add(new Person("李四",80,140,90));
        list.add(new Person("王五",80,130,82));
        list.add(new Person("张三",85,150,100));

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.Chinese != o2.Chinese) {
                    return o1.Chinese - o2.Chinese;
                } else if (o1.Math != o2.Math) {
                    return o2.Math - o1.Math;
                } else {
                    return o1.English - o2.English;
                }
            }
        });
        System.out.println(list);

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return (o1.Chinese - o2.Chinese ==0?(o2.Math-o1.Math==0?(o1.Chinese -o2.Chinese):(o2.Math-o1.Math)):o1.Chinese-o2.Chinese);
            }
        });
        System.out.println(list);


    }
}

class Person{
    String name;
    int Chinese;
    int Math;
    int English;

    public Person(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", Math=" + Math +
                ", English=" + English +
                '}';
    }
}

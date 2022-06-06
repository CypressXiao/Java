package JavaBase.day5_4;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName EnumDemo1
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 9:42
 * @Version 1.0
 */

public class EnumDemo1 {
    public static void main(String[] args) {
       //EnumDemo1.getInfo(Person.Jordan);
        Person person =  Person.valueOf("Kobe");
        System.out.println(person.getInfo());
        System.out.println("============================");
        System.out.println(Person.values().length);
        System.out.println("============================");
        for (Person value : Person.values()) {
           if(value.getInfo().equals("篮球之神")){
               System.out.println(value);
           }
        }
        System.out.println("============================");
        EnumSet<Person> set = EnumSet.allOf(Person.class);
        set.forEach(System.out::println);
        System.out.println("============================");
        EnumMap<Person,String> map  = new EnumMap<Person, String>(Person.class);
        map.put(Person.Jordan,"Jordan");
        map.put(Person.Kobe,"Kobe");
        map.put(Person.James,"James");

        Set<Map.Entry<Person,String>> set1 = map.entrySet();

    }

    public static void getInfo(Person p){
        switch (p){
            case Jordan:
                System.out.println(p.getInfo());
                break;
            case Kobe:
                System.out.println(p.getInfo());
                break;
            case James:
                System.out.println(p.getInfo());
                break;
        }
    }
}

enum Person{
    Jordan("篮球之神","6个总冠军"),Kobe("曼巴","5个总冠军"),James("小皇帝","4个总冠军");

    private String info;
    private String award;

    Person(String info,String award){
        this.info = info;
        this.award = award;
    }

    public String getInfo() {
        return info;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "info='" + info + '\'' +
                ", award='" + award + '\'' +
                '}';
    }
}

package JavaBase.day5_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * 1. 第一个队伍只要名字为3个字的成员姓名；
 * 2. 第一个队伍筛选之后只要前3个人；
 * 3. 第二个队伍只要姓张的成员姓名；
 * 4. 第二个队伍筛选之后不要前2个人；
 * 5. 将两个队伍合并为一个队伍；
 * 6. 打印整个队伍的姓名信息。
 */
public class DailyReviewDemo2 {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        Stream<String> s1 = one.stream();
        Stream<String> str1 = s1.filter(s2 -> s2.length() == 3).limit(3);

        Stream<String> s2 = two.stream();
        Stream<String> str2 = s2.filter(s3->s3.startsWith("张")).skip(2);

        Stream.concat(str1,str2).forEach(s -> System.out.println(s+" "));
    }
}

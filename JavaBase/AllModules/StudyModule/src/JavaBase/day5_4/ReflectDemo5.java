package JavaBase.day5_4;


import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName ReflectDemo5
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 17:10
 * @Version 1.0
 */

public class ReflectDemo5 {
    public static void main(String[] args) {
        final Person2 person2 = new Person2("1",100);
        System.out.println(person2);
    }
}


@Data
@AllArgsConstructor

class Person2{
    String name;
    int age;
}

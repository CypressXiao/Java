package LoginAndrigester.commonclass;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/12 11:02
 * @Version 1.0
 */

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    private int sid;
    private String sname;
    private int age;
    private String sgender;
    private String tid;
}

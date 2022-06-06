package LoginAndrigester.commonclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Message
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/12 9:16
 * @Version 1.0
 */
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Message implements Serializable {
    public static final long serialVersionUID = 1L;
    private String id;
    private String username;
    private String password;
    private String mesType;
    private String comment;
    private String stuName;
    private Student stu;
    private ArrayList<Student> stus;
}

package LoginAndrigester.commonclass;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/12 8:08
 * @Version 1.0
 */
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
}

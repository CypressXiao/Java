package rpc_client.src.common_class;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description 该类用于存储用户的信息
 * @Author 肖榆柏
 * @Date 2022/5/5 19:26
 * @Version 1.0
 */

@Data
@AllArgsConstructor
public class User implements Serializable {
    public static final long serialVersionUID = 1L;
    private String username;
    private String password;
}

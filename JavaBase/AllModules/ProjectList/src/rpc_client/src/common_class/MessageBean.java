package rpc_client.src.common_class;



/**
 * @ClassName MessageBean
 * @Description 储存所有用户信息以及服务端应该执行的操作的类
 * @Author 肖榆柏
 * @Date 2022/5/5 19:37
 * @Version 1.0
 */

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class MessageBean implements Serializable {
    public static final long serialVersionUID =1L;
    //服务端反射要使用的类全类名
    private String className;
    //服务端反射要调用的方法名称
    private String methodName;
    //方法中要传的参数的Class对象,个数类型不确定,故考虑用数组
    private Class<?>[] paras;
    //用户类对象,用于选择操作之后的验证
    private User user;
}

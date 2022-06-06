package rpc_client.src.common_class;

/**
 * @ClassName Information
 * @Description 存储服务端返回信息的类
 * @Author 肖榆柏
 * @Date 2022/5/6 6:54
 * @Version 1.0
 */
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Information implements Serializable {
    public static final long serialVersionUID =1L;
    private String info;
}

package rpc_server.src.common_class;

import java.io.IOException;
import java.net.Socket;

/**
 * @InterfaceName UserAction
 * @Description 包含用户所有操作的接口
 * @Author 肖榆柏
 * @Date 2022/5/5 19:35
 * @Version 1.0
 */
public interface UserAction{

    String login(User user) throws Exception;

    String register(User user) throws Exception;
}


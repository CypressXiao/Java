package rpc_client.src.common_class;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * @ClassName UserImpl
 * @Description 用户操作的实现类
 * @Author 肖榆柏
 * @Date 2022/5/5 19:34
 * @Version 1.0
 */

public class UserImpl implements UserAction {
    private static final String db;
    static{
        final Properties pro = new Properties();
        try {
            pro.load(UserImpl.class.getClassLoader().getResourceAsStream("config\\client_info.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        db = pro.getProperty("database");
    }

    @Override
    public String login(User user) throws Exception {
        //先反序列化
        final HashMap<String, User> map = SerializeOperation.recSerialize(db);
        final User user1 = map.get(user.getUsername());
        String s1;
        if (user1 == null) {
            s1 = "该用户未注册!";
        } else if (!user.equals(user1)) {
            s1 = "密码错误!";
        } else {
            s1 = "登录成功!";
        }
        return s1;
    }

    @Override
    public String register(User user) throws Exception {
        //注册时,反序列化出保存用户信息的map,判断是第一次以及是否已经注册
        //首先要有个序列化文件储存的地址
        final File f = new File(db);
        //通过判断f是否存在判断是是否是整个服务端的第一次注册
        String s1 = null;
        if (!f.exists()) {
            //不存在则新创建map集合,添加用户并将其序列化
            System.out.println("该服务端第一次使用~~");
            final HashMap<String, User> map = new HashMap<>();
            map.put(user.getUsername(), user);
            SerializeOperation.serialize(map, db);
            s1 = "注册成功!";
        } else {
            //存在则反序列化得到集合
            final HashMap<String, User> map = SerializeOperation.recSerialize(db);
            //判断该用户是否注册
            final User user1 = map.get(user.getUsername());
            if (user1 != null) {
                //说明该用户已注册
                s1 = "该用户已注册!";
            } else {
                //未注册则添加,然后反序列化
                map.put(user.getUsername(), user);
                SerializeOperation.serialize(map, db);
                s1 = "注册成功!";
            }
        }
        return s1;
    }
}

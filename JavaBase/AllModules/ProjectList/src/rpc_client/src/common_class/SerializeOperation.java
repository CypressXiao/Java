package rpc_client.src.common_class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 * @ClassName SerializeOperation
 * @Description 封装序列化和反序列化操作的类
 * @Author 肖榆柏
 * @Date 2022/5/5 21:00
 * @Version 1.0
 */

public class SerializeOperation {
    //序列化的方法,传入一个map集合,和配置文件位置
    public static void serialize(HashMap<String, User> map,String s) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(s));
        oos.writeObject(map);
        System.out.println("用户信息序列化完成!");
    }

    //反序列化的方法,返回值是一个map结合,传入配置文件的地址
    public static HashMap<String, User> recSerialize(String s) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s));
        return (HashMap<String, User>) ois.readObject();
    }
}

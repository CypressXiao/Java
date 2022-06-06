package LogAndRegisterProject;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class SerializableOperation {
    //使用静态代码块设置配置文件
    static Properties pro;
    static{
        pro = new Properties();
        try {
            FileReader fr =new FileReader("conf/file_name.properties");
            pro.load(fr);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //序列化操作
    public static void serialize(HashMap<String, User> map){
        try {
            //将对象存入对应的文件中
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pro.getProperty("filename")));
            oos.writeObject(map);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //反序列化操作
    public static HashMap<String,User> deserialize(){
        HashMap<String,User> map = null;
        //根据配置文件中的文本信息创建File文件
        File file = new File(pro.getProperty("filename"));
        //如果该文件不存在,则说明还没有用户注册,返回一个map集合;如果存在则反序列化回一个集合
        if(!file.exists()){
            map = new HashMap<>();
        }else{
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
                map =(HashMap<String, User>) ois.readObject();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //返回一个map
        return map;
    }
}

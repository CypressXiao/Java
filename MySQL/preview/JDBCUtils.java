/**
 * @ClassName JDBCUtils
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 16:01
 * @Version 1.0
 */

import lombok.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class JDBCUtils {
    public static Connection getConnection() throws Exception {
        final Properties pro = new Properties();
        pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("conf/JDBC.properties"));
        Class.forName(pro.getProperty("driver"));

        return DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("username"), pro.getProperty("password"));
    }

    public static void closeSource(AutoCloseable... a) throws Exception {
        for (AutoCloseable ac : a) {
            if (ac != null) {
                ac.close();
                ac = null;
            }
        }
    }
}


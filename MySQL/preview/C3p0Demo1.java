import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

/**
 * @ClassName JDBCDemo4
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 16:46
 * @Version 1.0
 */

public class C3p0Demo1 {
    public static void main(String[] args) throws SQLException {
        //创建 连接池对象,该对象会根据配置文件自动获取文件中的所有连接参数
        //然后创建连接对象
        final ComboPooledDataSource cds = new ComboPooledDataSource();

        //从池子中拿出连接对象并且获取执行sql的对象
        final QueryRunner qr = new QueryRunner(cds);
        //执行sql语句并且查看返回值
        //当sql改变了几行语句,返回值就是几
        //修改
        //final int num = qr.update("update employee set name = 'James' where id = 10001");
        //删除
        /*qr.update("insert  into employee values(?,?,?,?,?,?)",10007,"jordan","男","12345678",)

        System.out.println(num);
*/
    }
}

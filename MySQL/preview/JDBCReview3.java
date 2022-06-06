import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName JDBCReview3
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 22:05
 * @Version 1.0
 */

public class JDBCReview3 {
    public static void main(String[] args) throws SQLException {
        final ComboPooledDataSource pool = new ComboPooledDataSource();
        final QueryRunner qr = new QueryRunner(pool);
        /*final List<Student> query = qr.query("select * from student", new BeanListHandler<>(Student.class));
        System.out.println(query);*/
        /*final Student query = qr.query("select * from student where id =1", new BeanHandler<>(Student.class));
        System.out.println(query);*/
        final Number query = qr.query("select count(1) from student where id>?", new ScalarHandler<>(), 4);
        System.out.println(query);
    }
}

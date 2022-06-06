import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @ClassName JDBCReview1
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 21:11
 * @Version 1.0
 */

public class JDBCReview1 {
    private static Connection con;
    private static Statement statement;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db2?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false", "root", "123456");
            statement = con.createStatement();
            String sql = "update test1 set num = 3 where num =1";
            final int num = statement.executeUpdate(sql);
            System.out.println(num);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if(statement!= null){
                    statement.close();
                    statement = null;
                }
                if(con!=null){
                    con.close();
                    con =null;
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}

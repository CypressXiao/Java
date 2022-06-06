
import java.sql.*;
import java.util.Scanner;

/**
 * @ClassName JDBCDemo2
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 15:43
 * @Version 1.0
 */

public class JDBCDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db2?characterEncoding = utf8", "root", "123456");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的员工id:");
        String str = sc.next();

        String sql = "select name from employee where id =?";

        final PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,str);

        final ResultSet resultSet = ps.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        ps.close();
        connection.close();

    }
}

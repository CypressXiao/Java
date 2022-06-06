import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @ClassName JDBCDemo3
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 15:48
 * @Version 1.0
 */

public class JDBCDemo3 {
    private static Connection conn;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static void main(String[] args) {

        try {
            conn = JDBCUtils.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要查找的id:");
            String str = sc.next();

            String sql ="select name from employee where id = ?";

            ps = conn.prepareStatement(sql);


            ps.setString(1,str);
            rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.closeSource(conn,ps,rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

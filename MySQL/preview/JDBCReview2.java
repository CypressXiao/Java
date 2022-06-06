import java.sql.*;

/**
 * @ClassName JDBCReview2
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 21:37
 * @Version 1.0
 */

public class JDBCReview2 {
    private static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db2?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&useSSL=false", "root", "123456");

           /* String sql = "insert into student values (?,?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1,"7");
            ps.setString(2,"李逵");
            ps.setString(3,"50");
            ps.setString(4,"59");
            ps.setString(5,"57");
            String sql ="delete from student where id=1 and name ='李逵'";
            final int num = ps.executeUpdate();
            System.out.println(num);
            */
            String sql = "select * from student where id = 2";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                System.out.println("{"+s1+","+s2+","+s3+","+s4+","+s5+"}");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                JDBCUtils.closeSource(con,ps,rs);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

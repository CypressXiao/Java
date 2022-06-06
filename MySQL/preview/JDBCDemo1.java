import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //创建驱动对象
        Class.forName("com.mysql.jdbc.Driver");

        //开始连接mysql jdbc:mysql//localhost:3306/数据库名
        final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db2?characterEncoding=utf-8&autoReconnect=true&useSSL=false", "root", "123456");

        //写一句sql
        String sql = "insert into employee values(10006,'Jess','女','123456789023','四川绵阳',3000)";
        //String sql = "delete from employee where id = 10006";
        //String sql = "update employee set name = '张三' where name = '张一一'";
        //String sql = "select * from employee";


        //获取能够将sql语句提交给数据库的对象
        final Statement statement = connection.createStatement();

      /*  final ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
                    System.out.println(resultSet.getString("id")+"--"
                            +resultSet.getString("name") + "--" +
                            resultSet.getString("sex") + "--" +
                            resultSet.getString("tel") + "--" +
                            resultSet.getString("addr") + "--" +
                            resultSet.getString("salary"));
        }*/

        //将sql语句直接传递给数据库开始执行
        statement.execute(sql);

        connection.close();

        //


    }
}
package Database01;

import java.sql.*;

public class Database_test {
    public static void main(String[] args) {
        Connection con;
        String driver="com.mysql.jdbc.Driver";
        //这里我的数据库是qcl
        String url="jdbc:mysql://localhost:3306/Student_test";
        String user="root";
        String password="290134";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
            Statement statement = con.createStatement();
            String sql = "select * from student;";//我的表格叫student
            ResultSet resultSet = statement.executeQuery(sql);
            String name;
            while (resultSet.next()) {
                name = resultSet.getString("name");
                System.out.println("姓名：" + name);
            }
            resultSet.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动没有安装");

        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        }
    }
}

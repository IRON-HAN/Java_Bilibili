// idea导jar包

import java.sql.*;
import java.util.ResourceBundle;
public class Demo1
{
    public static void main(String[] args)
    {
        // 使用资源绑定起绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String address = bundle.getString("address");
        String database = bundle.getString("database");
        String url = address + database;
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        // 创建对象
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try
        {
            // 1. 注册驱动
            Class.forName(driver);
            // 2. 获取连接
            connection = DriverManager.getConnection(url, user, password);
            // 3. 获取数据库操作对象
            statement = connection.createStatement();
            // 4. 执行sql
            String sql = "select * from employees";
            // 5. 处理结果
            set = statement.executeQuery(sql);
            while (set.next())
            {
                // ! 有别名用别名
                String name = set.getString("first_name");
                System.out.println(name);
            }
        } catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        } finally
        { // 6. 释放资源
            try
            {
                if (set != null)
                    set.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
            try
            {
                if (statement != null)
                    statement.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
            try
            {
                if (connection != null)
                    connection.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}


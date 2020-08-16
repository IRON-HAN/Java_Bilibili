package TOOL;

import java.sql.*;
import java.util.ResourceBundle;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/9 17:21
 */
public class MySql
{
    /*
      @description: 静态初始化器
     * @param: null
     * @return: None
     * @throws: None
     * @date: 20/8/9 17:35
     */
    static
    {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        try
        {
            Class.forName(driver);
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    private MySql() {}

    /**
     * @description: 获取数据库连接
     * @return: java.sql.Connection
     * @throws: None
     * @date: 20/8/9 17:35
     */
    public static Connection getConnection() throws SQLException
    {
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String address = bundle.getString("address");
        String database = bundle.getString("database");
        String url = address + database;
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * @description: 释放资源
     * @param: connection 连接
     * @param: statement 对象
     * @param: set 结果集
     * @return: void
     * @throws: None
     * @date: 20/8/9 17:35
     */
    public static void CloseAll(Connection connection, Statement statement, ResultSet set)
    {
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


import java.sql.*;
import java.util.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/9 16:46
 */
public class Login
{
    public static void main(String[] args)
    {
        // 初始化
        Map< String, String > info = initUI();
        // 验证
        boolean flag = login(info);
        // 输出结果
        System.out.println(flag ? "登陆成功" : "登陆失败");
    }

    private static boolean login(Map< String, String > info)
    {
        boolean flag = false;
        // 使用资源绑定起绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String address = bundle.getString("address");
        String database = bundle.getString("database");
        String url = address + database;
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        // 获取用户名和密码
        String name = info.get("name");
        String pwd = info.get("pwd");
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
            String sql =
                    "select * from employees WHERE name='" + name + "' AND pwd='" + pwd + "' ";
            set = statement.executeQuery(sql);
            if (set.next())
                flag = true;
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
        return flag;
    }

    private static Map< String, String > initUI()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名");
        String name = scanner.nextLine();
        System.out.println("输入密码");
        String pwd = scanner.nextLine();
        Map< String, String > info = new HashMap<>();
        info.put("name", name);
        info.put("pwd", pwd);
        return info;
    }
}


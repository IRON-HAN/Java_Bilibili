import java.sql.*;

import static TOOL.MySql.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/9 17:37
 */
public class Demo2
{
    public static void main(String[] args)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try
        {
            connection = getConnection();
            System.out.println(connection);
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            CloseAll(connection, statement, set);
        }
    }
}


package IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Pcy
 * @date: 20/7/18 9:49
 */
public class Logger
{
    public static void main(String[] args)
    {
        printLog("an error occur!");
    }

    public static void printLog(String msg)
    {
        try
        {
            // 1. 指向一个日志文件
            PrintStream logOut = new PrintStream(new FileOutputStream("log.txt", true));
            // 2. 改变输出方向
            System.setOut(logOut);
            // 3. 获取并格式化时间
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = sdf.format(now);

            System.out.println(s + ": " + msg);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}


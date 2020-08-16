package Threads;

import java.text.*;
import java.util.*;

/**
 * @description: 使用Timer和TimerTask
 * @author: Pcy
 * @date: 20/7/19 10:08
 */
public class Demo06
{
    public static void main(String[] args)
    {
        Timer timer = new Timer();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date first = null;
        try
        {
            first = sdf.parse("2020-07-19 10:15:00");
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        assert first != null;
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(sdf.format(new Date()) + ":成功完成了一次任务");
            }
        }, first, 1000 * 3);
    }
}


package Threads;

public class PrintTest
{
    public static void print(int cnt)
    {
        for (int i = 1; i < cnt; ++i)
            System.out.println(Thread.currentThread().getName() + "-->" + i);
    }

    public static void print_sleep(int cnt)
    {
        for (int i = 1; i < cnt; ++i)
        {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

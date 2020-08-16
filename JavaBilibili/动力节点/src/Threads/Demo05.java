package Threads;

/**
 * @description: 守护线程 Daemon
 * @author: Pcy
 * @date: 20/7/19 8:51
 */
public class Demo05
{
    public static void main(String[] args)
    {
        Thread thread = new Thread(new AThread());
        thread.setName("守护线程");
        thread.setDaemon(true);
        thread.start();

        // 主线程
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + ": " + i);
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

class AThread implements Runnable
{

    @Override
    public void run()
    {
        int i = 0;
        while (true)
        {
            System.out.println(Thread.currentThread().getName() + ": " + (++i));
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
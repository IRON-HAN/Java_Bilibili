package Threads;

/**
 * @description: How to stop a thread
 * @author: Pcy
 * @date: 20/7/18 20:50
 */
public class Demo03
{
    public static void main(String[] args)
    {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.setName("t");
        thread.start();

        try
        {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        myRunnable.running = false;
    }
}

class MyRunnable implements Runnable
{
    boolean running = true;

    @Override
    public void run()
    {
        for (int i = 0; i < 10; ++i)
            if (running)
            {
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
            else
                return;
    }
}

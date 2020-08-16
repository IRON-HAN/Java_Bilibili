package Treads;

import java.util.concurrent.locks.ReentrantLock;
/**
 * @description: Use Lock instead of synchronized
 * @author: Pcy
 * @date: 20/7/24 15:17
 */
public class Windows2 implements Runnable
{
    public static void main(String[] args)
    {
        Windows2 w = new Windows2();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t3.start();
        t2.start();
        t1.start();
    }

    private int ticket = 50;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                lock.lock();
                if (ticket > 0)
                {
                    try
                    {
                        Thread.sleep(100);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + ticket);
                    --ticket;
                }
                else break;
            } finally
            {
                lock.unlock();
            }
        }
    }
}


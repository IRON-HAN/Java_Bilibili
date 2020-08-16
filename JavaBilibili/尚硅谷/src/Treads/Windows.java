package Treads;

/**
 * @description: Runable sychronized
 * @author: Pcy
 * @date: 20/7/24 14:58
 */
public class Windows implements Runnable
{
    public static void main(String[] args)
    {
        Windows w = new Windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }

    private int ticket = 1000;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (Windows.class)
            {
                if (ticket > 0)
                {
                    try
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + ticket);
                    --ticket;
                }
                else break;
            }
        }
    }
}



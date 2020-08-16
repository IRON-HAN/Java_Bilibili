package Treads;

/**
 * @description:
 * @author: Pcy
 * @date: 20/7/24 18:14
 */
public class Product
{
    public static void main(String[] args)
    {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        Thread p1 = new Thread(producer);
        Thread c1 = new Thread(consumer);
        Thread c2 = new Thread(consumer);
        p1.setName("生产者1");
        c1.setName("消费者1");
        c2.setName("消费者2");
        p1.start();
        c1.start();
        c2.start();
    }
}

class Clerk
{
    private int cnt = 0;

    private static final int COUNT_MIN = 0;
    private static final int COUNT_MAX = 20;

    public int getCnt()
    { return cnt; }

    public void setCnt(int cnt)
    { this.cnt = cnt; }

    public synchronized void producer()
    {
        if (getCnt() < COUNT_MAX)
        {
            // 先生产,后输出
            setCnt(getCnt() + 1);
            System.out.println(Thread.currentThread().getName() + "生产第" + getCnt());
            notifyAll();
        }
        else
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumer()
    {
        if (getCnt() > COUNT_MIN)
        {
            // 先输出,后消费
            System.out.println(Thread.currentThread().getName() + "消费" + getCnt());
            setCnt(getCnt() - 1);
            notifyAll();
        }
        else
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable
{
    private Clerk clerk;

    public Producer(Clerk clerk)
    {
        this.clerk = clerk;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "开始生产");
        while (true)
        {
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            clerk.producer();
        }
    }
}

class Consumer implements Runnable
{
    private Clerk clerk;

    public Consumer(Clerk clerk)
    {
        this.clerk = clerk;
    }

    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "开始消费");
        while (true)
        {
            try
            {
                Thread.sleep(300);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            clerk.consumer();
        }
    }
}

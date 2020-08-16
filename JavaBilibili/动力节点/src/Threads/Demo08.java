package Threads;

import java.util.*;

/**
 * @description: 使用wait和notify(在线程同步的基础上)
 * 实现"生产者消费者模式"
 * 1. 定义: 生产线程负责生产,消费线程负责消费. 生产和消费达到平衡
 * 2. wait和notify是java对象都有的方法
 * 3. o.wait() : 让正在o对象上活动的线程t进入等待状态, 并且释放掉t线程之前占有的o对象的锁
 * 4. o.notify() : 让正在o对象上等待的线程唤醒, 但不释放o对象上之前占用的锁
 * @author: Pcy
 * @date: 20/7/19 11:16
 */
public class Demo08
{
    public static void main(String[] args)
    {
        List list = new ArrayList();

        Thread t1 = new Thread(new producer(list));
        Thread t2 = new Thread(new consumer(list));

        t1.setName("producer");
        t2.setName("consumer");

        t1.start();
        t2.start();

    }
}

class producer implements Runnable
{
    private List repository;

    public producer(List repository)
    {
        this.repository = repository;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; ++i)
        {
            synchronized (repository)
            {
                if (!repository.isEmpty())
                {
                    try
                    {
                        repository.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                // 程序运行到这里说明仓库是空的 可以继续生产
                Object o = new Object();
                repository.add(o);
                System.out.println(Thread.currentThread().getName() + "生产了: " + o);
                // 唤醒消费者
                repository.notify();
            }
        }
    }
}

class consumer implements Runnable
{
    private List repository;

    public consumer(List repository)
    {
        this.repository = repository;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; ++i)
        {
            synchronized (repository)
            {
                if (repository.isEmpty())
                {
                    try
                    {
                        repository.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                Object o = repository.remove(0);
                System.out.println(Thread.currentThread().getName() + "消费了: " + o);

                repository.notify();
            }
        }

    }
}
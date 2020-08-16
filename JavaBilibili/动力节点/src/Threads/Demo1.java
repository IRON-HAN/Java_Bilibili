package Threads;

/**
 * @description: 3种new 线程的方式
 * 1. 创建Thread子类
 * 2. 创建Runnable实现类
 * 3. 创建Runnable匿名内部类
 * @author: Pcy
 * @date: 20/7/18 20:19
 */
public class Demo1
{
    public static void main(String[] args)
    {
        // Method 1
        new MThread().start();
        // Method 2
        new Thread(new MRunnable()).start();
        // Method 3
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 100; ++i)
                    System.out.println("匿名 " + i);
            }
        }).start();

        for (int i = 0; i < 100; ++i)
            System.out.println("main " + i);
    }
}

class MThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; ++i)
            System.out.println("继承 " + i);
    }
}

class MRunnable implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 100; ++i)
            System.out.println("实现 " + i);
    }
}
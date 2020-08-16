package Threads;

/**
 * @description: Two methods
 * 1. Thread.currentThread() 静态方法,返回当前正在执行的线程
 * 2. .getName() 实例方法,返回调用者的线程名
 * @author: Pcy
 * @date: 20/7/18 20:30
 */
public class Demo02
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; ++i)
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

package Threads;
/*
doA begin
doB begin
doB end
doA end
*/

/**
 * @description: 因为doB方法没有加关键字, 所以线程2执行doB的时候并没有锁, 不需要等t1执行
 * ★ 如果doB加上关键字, 则需要等t1先执行
 * @author: Pcy
 * @date: 20/7/18 23:29
 */
public class Test1
{
    public static void main(String[] args)
    {
        MClass mClass = new MClass();

        Thread t1 = new Thread(new MyThread(mClass));
        Thread t2 = new Thread(new MyThread(mClass));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try
        {
            Thread.sleep(1000); // 为了保证t1先于t2执行
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MClass
{
    public synchronized void doA()
    {
        System.out.println("doA begin");
        try
        {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("doA end");
    }

    public void doB()
    {
        System.out.println("doB begin");
        System.out.println("doB end");
    }
}

class MyThread implements Runnable
{
    private MClass mClass;

    public MyThread(MClass mClass)
    {
        this.mClass = mClass;
    }

    @Override
    public void run()
    {
        if (Thread.currentThread().getName().equals("t1"))
            mClass.doA();
        if (Thread.currentThread().getName().equals("t2"))
            mClass.doB();
    }
}

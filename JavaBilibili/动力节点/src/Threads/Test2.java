package Threads;

/**
 * @description: static前加关键字 表示类锁
 * @author: Pcy
 * @date: 20/7/18 23:45
 */
public class Test2
{
    public static void main(String[] args)
    {
        M_Class mClass1 = new M_Class();
        M_Class mClass2 = new M_Class();

        Thread t1 = new Thread(new M_Thread(mClass1));
        Thread t2 = new Thread(new M_Thread(mClass2));

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

class M_Class
{
    public synchronized static void doA()
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

    public synchronized static void doB()
    {
        System.out.println("doB begin");
        System.out.println("doB end");
    }
}

class M_Thread implements Runnable
{
    private M_Class mClass;

    public M_Thread(M_Class mClass)
    {
        this.mClass = mClass;
    }

    @Override
    public void run()
    {
        if (Thread.currentThread().getName().equals("t1"))
            M_Class.doA();
        if (Thread.currentThread().getName().equals("t2"))
            M_Class.doB();
    }
}


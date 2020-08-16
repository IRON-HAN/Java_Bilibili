package Threads;

/**
 * @description:
 * @author: Pcy
 * @date: 20/7/19 12:39
 */
public class Homework
{
    public static void main(String[] args)
    {
        num number = new num(0);

        Thread t1 = new Thread(new odd(number));
        Thread t2 = new Thread(new even(number));

        t1.setName("odd");
        t2.setName("even");

        t1.start();
        t2.start();

    }
}

class num
{
    private int value;

    public num(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}

class odd implements Runnable
{
    private num number;

    public odd(num number)
    {
        this.number = number;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (number)
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                if ((number.getValue() % 2) == 0)
                {
                    try
                    {
                        number.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : i = " + number.getValue());
                number.setValue(number.getValue() + 1);
                number.notify();
            }
        }
    }
}

class even implements Runnable
{
    private num number;

    public even(num number)
    {
        this.number = number;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (number)
            {
                try
                {
                    Thread.sleep(1000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                if ((number.getValue() % 2) != 0)
                {
                    try
                    {
                        number.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : i = " + number.getValue());
                number.setValue(number.getValue() + 1);
                number.notify();
            }
        }

    }
}


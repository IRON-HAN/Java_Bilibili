package Treads;

import java.util.concurrent.locks.ReentrantLock;
/**
 * @description:
 * @author: Pcy
 * @date: 20/7/24 15:24
 */
public class AccountTest
{
    public static void main(String[] args)
    {
        Account account = new Account(100);
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        t1.setName("账户1");
        t2.setName("账户2");
        t1.start();
        t2.start();
    }
}

class Account implements Runnable
{
    private int balance;

    private ReentrantLock lock = new ReentrantLock();

    public Account()
    { }

    public Account(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    { return balance; }

    public void setBalance(int balance)
    { this.balance = balance; }

    public void save(int amount)
    { setBalance(getBalance() + amount); }

    @Override
    public void run()
    {
        for (int i = 0; i < 3; i++)
        {
            try
            {
                lock.lock();
                save(1000);
                System.out.println(Thread.currentThread().getName() + "-->" + getBalance());
                try
                {
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            } finally
            {
                lock.unlock();
            }
        }
    }
}


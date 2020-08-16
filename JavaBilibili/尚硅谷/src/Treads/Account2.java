package Treads;

/**
 * @description:
 * @author: Pcy
 * @date: 20/7/24 15:42
 */
class Account_2
{
    private double balance;

    public Account_2(double balance)
    {
        this.balance = balance;
    }

    // 存钱
    public synchronized void deposit(double amt)
    {
        if (amt > 0)
        {
            balance += amt;
            try
            {
                Thread.sleep(50);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": 存钱成功。余额为：" + balance);
        }
    }
}

class Customer extends Thread
{

    private Account_2 acct;

    public Customer(Account_2 acct)
    {
        this.acct = acct;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++)
        {
            acct.deposit(50);
        }
    }
}

public class Account2
{

    public static void main(String[] args)
    {
        Account_2 acct = new Account_2(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);
        c1.setName(" 甲 ");
        c2.setName(" 乙 ");
        c1.start();
        c2.start();
    }
}


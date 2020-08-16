package Threads;

/**
 * @description: 代码的执行原理
 * 1. 假设t1,t2并发, 开始执行代码的时候有先后顺序
 * 2. 假设t1先执行, 遇到了synchronized, 此时自动找()内共享对象的对象锁
 * 找到之后,占有这把锁,执行{}中的内容
 * 直到{}语句结束,才会释放锁
 * 3. 在t1占有这把锁的同时, t2也遇到了synchronized, 此时t2只能在{}外
 * 等待t1执行完{}中的内容,释放了这把锁,才能进入{}中执行语句
 * ★: ()中一定是"共享的对象" --> 一般是this
 * @author: Pcy
 * @date: 20/7/18 20:52
 */
public class Demo04
{
    public static void main(String[] args)
    {
        Account account = new Account("001", 10000);

        Thread t1 = new Thread(new AccountThread(account));
        Thread t2 = new Thread(new AccountThread(account));

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class Account
{
    private String no;
    private double balance;

    public Account(String no, double balance)
    {
        this.no = no;
        this.balance = balance;
    }

    public Account()
    {
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getNo()
    {
        return no;
    }

    public void setNo(String no)
    {
        this.no = no;
    }

    /*
     * synchronized()中写什么?
     * 如果t1,t2,t3三个线程
     * 让t1,t2排队 t3不排队
     * 需要在()填入t1,t2共享的对象
     * */
    public void withdraw(double money)
    {
        synchronized (this)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            setBalance(getBalance() - money);
        }
    }

    public synchronized void save(double money)
    { // 在声明里加synchronized相当于锁this, 且范围是整个方法体
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        setBalance(getBalance() + money);
    }
}

class AccountThread implements Runnable
{
    private Account account;

    public AccountThread(Account account)
    {
        this.account = account;
    }

    @Override
    public void run()
    {
        account.save(5000);
        System.out.println(Thread.currentThread().getName() + "对" + account.getNo() + "取款5000,余额" + account.getBalance());
    }
}


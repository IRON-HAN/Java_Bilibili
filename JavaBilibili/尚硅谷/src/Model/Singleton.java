package Model;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/9 8:39
 */
public class Singleton
{
    public static void main(String[] args)
    {
        Bank bank = Bank.getInstance();
        Bank bank1 = Bank.getInstance();
        System.out.println(bank == bank1);
    }
}

// 懒汉 : 线程不安全 后面需要改进
class Bank
{
    private static Bank bank;

    private Bank() {}

    public static Bank getInstance()
    {
        if (bank == null)
            bank = new Bank();
        return bank;
    }
}

// 饿汉
class House
{
    private static House instance = new House();

    private House() {}

    public static House getInstance()
    { return instance; }
}
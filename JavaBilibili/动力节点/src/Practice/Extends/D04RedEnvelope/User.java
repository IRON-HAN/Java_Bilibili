package Practice.Extends.D04RedEnvelope;

public class User
{
    private String name;
    private int balance;

    public void show()
    {
        System.out.print("name = " + name);
        System.out.println("\tbalance = " + balance);
    }

    public User()
    {
    }

    public User(String name, int balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}

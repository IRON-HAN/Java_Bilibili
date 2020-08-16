package Practice.Extends.D04RedEnvelope;

import java.util.*;

public class Member extends User
{
    public Member()
    {
    }

    public Member(String name, int balance)
    {
        super(name, balance);
    }

    public void receive(ArrayList<Integer> list)
    {
        int index = new Random().nextInt(list.size());
        int rec = list.remove(index);
        int money = super.getBalance();
        super.setBalance(money + rec);
    }
}

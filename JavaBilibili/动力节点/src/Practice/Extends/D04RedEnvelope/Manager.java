package Practice.Extends.D04RedEnvelope;

import java.util.ArrayList;

public class Manager extends User
{
    public Manager()
    {
    }

    public Manager(String name, int balance)
    {
        super(name, balance);
    }

    public ArrayList<Integer> send(int total, int cnt)
    {

        ArrayList<Integer> redList = new ArrayList<>();

        int left = super.getBalance();
        if (total > left)
        {
            System.out.print("余额不足\n");
            return redList;
        }

        super.setBalance(left - total);

        int avg = total / cnt;
        int mod = total % cnt;

        for (int i = 0; i < cnt - 1; ++i)
            redList.add(avg);

        int last = avg + mod;
        redList.add(last);

        return redList;
    }

}

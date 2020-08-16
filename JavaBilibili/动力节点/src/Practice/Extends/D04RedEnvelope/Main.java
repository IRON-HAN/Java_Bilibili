package Practice.Extends.D04RedEnvelope;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("A", 0);
        Member two = new Member("B", 0);
        Member three = new Member("C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();

        ArrayList<Integer> redList = manager.send(40, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}

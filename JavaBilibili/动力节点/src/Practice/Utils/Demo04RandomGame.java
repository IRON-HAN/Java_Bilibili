package Practice.Utils;

import java.util.*;

public class Demo04RandomGame
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//[1,100]
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("guess:");
            int guessNum = scanner.nextInt();

            if (guessNum > randomNum)
            {
                System.out.print("太大了\n");
            }
            else if (guessNum < randomNum)
            {
                System.out.print("太小了\n");
            }
            else
            {
                System.out.print("猜中了\n");
                break;
            }
        }
    }
}

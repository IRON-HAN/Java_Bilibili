package Practice.Utils;

import java.util.Random;

/**
 * @Description: 生成5个互不相同的随机数
 * @Author Pcy
 * @Date: 20/7/16 20:48
 */
public class RandomGenerate
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] res = new int[5];
        res[0] = random.nextInt(6);
        int index = 1;
        outLoop:
        while (index < 5)
        {
            int tmp = random.nextInt(6);
            for (int i = 0; i < index; i++)
                if (tmp == res[i])
                    continue outLoop;
            res[index++] = tmp;
        }

        for (int i : res)
        {
            System.out.println("i = " + i);
        }
    }
}


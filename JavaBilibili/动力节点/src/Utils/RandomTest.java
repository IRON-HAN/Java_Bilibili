package Utils;

import java.util.Random;

public class RandomTest
{
    public static void main(String[] args)
    {
        // 1. 定义
        Random r = new Random();
        // 2. 使用
        int num = r.nextInt();
        System.out.println("num = " + num);

        for (int i = 0; i < 10; ++i)
        {// 随机数范围:0-9
            num = r.nextInt(10);
            System.out.println("num = " + num);
        }
    }
}

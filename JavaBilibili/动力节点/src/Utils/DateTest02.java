package Utils;

/**
 * @description: DateTest02
 * 测试算法必备 : 如何获取运行时长
 * @version: 1.0
 * @date: 20/8/15 9:52
 */
public class DateTest02
{
    public static void main(String[] args)
    {
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("耗费" + (end - begin) + "毫秒");
    }

    public static void print()
    {
        for (int i = 0; i < 100000; i++)
            System.out.println("i = " + i);
    }
}


package Exception;

import java.io.*;

/**
 * @description: ExceptionTest2
 * try块中, 不会执行的代码
 * @version: 1.0
 * @date: 20/8/15 9:44
 */
public class ExceptionTest2
{
    public static void main(String[] args)
    {
        System.out.println("main begin");
        try
        {
            m1();
            // 如果在m1()中出现异常, 则以下代码不会执行
            System.out.println("after m1();");
        } catch (FileNotFoundException e)
        {
            System.out.println("file doesn't exist!");
        }
        System.out.println("main end");
    }

    public static void m1() throws FileNotFoundException
    {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 end");
    }

    public static void m2() throws FileNotFoundException
    {
        new FileInputStream("123.txt");
    }
}


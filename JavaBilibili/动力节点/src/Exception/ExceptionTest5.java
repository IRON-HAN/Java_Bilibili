package Exception;

public class ExceptionTest5
{
    public static void main(String[] args)
    {
        System.out.println("m() = " + m());// m=100
        m1();
        m2();
    }

    // try-->finally-->return
    public static void m1()
    {
        try
        {
            System.out.println("try...");
            return;
        } finally
        {
            System.out.println("finally...");
        }
    }

    // try-->exit 退出Jvm, finally语句块不执行
    public static void m2()
    {
        try
        {
            System.out.println("try...");
            System.exit(0);
        } finally
        {
            System.out.println("finally...");
        }
    }

    public static int m()
    {
        int i = 100;
        try
        {
            return i;
        } finally
        {
            ++i;
        }
    }
}


package String;

/**
 * @Description: 常量池的理解
 * @Author Pcy
 * @Date: 20/7/16 0:01
 */
public class StringTest
{
    public static void main(String[] args)
    {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 == s2 = " + s1 == s2);

        /* In this scope
         * 一共创建了3个obj
         * 1. "hello"在字符串常量池中
         * 2. 两个New分别在heap中创建了两个Obj
         * */
        {
            String s3 = new String("hello");
            String s4 = new String("hello");

            System.out.println("s3 == s4 = " + s3 == s4);
            System.out.println("s3.equals(s4) = " + s3.equals(s4));
        }

    }
}


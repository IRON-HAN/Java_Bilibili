/*
 * 1. split方法是一个正则表达式
 * 2. \\.
 * */


package String;

public class Demo06StringSplit
{
    public static void main(String[] args)
    {
        // 1. ","分割
        String s1 = "aaa,bbb";
        String[] a1 = s1.split(",");
        for (int i = 0; i < a1.length; i++)
        {
            System.out.println("a1[i] = " + a1[i]);
        }

        // 2. "."分割
        String s2 = "xxx.yyy";
        String[] a2 = s2.split("\\.");
        for (int i = 0; i < a2.length; i++)
        {
            System.out.println("a2[i] = " + a2[i]);
        }

    }
}

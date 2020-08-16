/*
 * 1. Scanner
 * 2. String string=sc.next();
 * 3. 定义4个变量,分别代表4种字符出现的次数
 * 4. toCharArray 之后可以进行遍历操作
 * */

package String;

import java.util.Scanner;

public class Demo07StringCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串\n");
        String string = sc.next();

        int cntUpper = 0;
        int cntLower = 0;
        int cntNumber = 0;
        int cntOther = 0;

        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++)
        {
            char ch = chars[i];
            if (isUpper(ch))
                ++cntUpper;
            else if (isLower(ch))
                ++cntLower;
            else if (isNumber(ch))
                ++cntNumber;
            else
                ++cntOther;
        }
        System.out.println("cntUpper = " + cntUpper);
        System.out.println("cntLower = " + cntLower);
        System.out.println("cntNumber = " + cntNumber);
        System.out.println("cntOther = " + cntOther);
    }

    public static boolean isUpper(char c)
    {
        return 'A' <= c && c <= 'Z';
    }

    public static boolean isLower(char c)
    {
        return 'a' <= c && c <= 'z';
    }

    public static boolean isNumber(char c)
    {
        return '0' <= c && c <= '9';
    }
}

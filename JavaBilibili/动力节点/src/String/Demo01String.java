/*
 * 1. 字符串的[内容]不能改变--即只改变指向
 * 2. 初始化字符串的4种方式
 * */

package String;

public class Demo01String
{
    public static void main(String[] args)
    {
        // 1. default ctor
        String str1 = new String();
        System.out.println("str1 = " + str1);

        // 2. char[]
        char[] chars = {'a', 'b', 'c'};
        String str2 = new String(chars);
        System.out.println("str2 = " + str2);

        // 3. byte[]
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println("str3 = " + str3);

        // 4. copy ctor
        String str4 = "Hello";
        System.out.println("str4 = " + str4);
    }
}

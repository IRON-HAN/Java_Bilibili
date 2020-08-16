/*
 * ★: ""在常量池中
 * ★: new出来的不在常量池中
 * */
package String;

public class Demo02StringPool
{
    public static void main(String[] args)
    {
        String str1 = "abc";
        String str2 = "abc";

        char[] chars = {'a', 'b', 'c'};
        String str3 = new String(chars);

        // 没有重写equals方法 比较的是地址值
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // false
    }
}

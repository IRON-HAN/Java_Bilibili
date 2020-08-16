package String;

public class Demo03StringEquals
{
    public static void main(String[] args)
    {
        String str1 = "hello";
        String str2 = "hello";
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);

        System.out.println(str1.equals(str2));// true
        System.out.println(str2.equals(str3));// true
        System.out.println(str3.equals("hello"));// true
        System.out.println("hello".equals(str1));// true

        String string = null;
        System.out.println("abc".equals(string)); // 推荐写法
//        System.out.println(string.equals("abc")); // 空指针异常

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));// false
        System.out.println(strA.equalsIgnoreCase(strB));// true


    }
}

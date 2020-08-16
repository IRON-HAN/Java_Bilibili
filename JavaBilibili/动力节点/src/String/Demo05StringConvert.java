package String;

public class Demo05StringConvert
{
    public static void main(String[] args)
    {
        // 1. 转换到char[]
        char[] chars = "Hello".toCharArray();
        System.out.print(chars[0] + "\n");

        // 2. replace char
        String str1 = "how do you do";
        String str2 = str1.replace('o', '*');
        System.out.println("str2 = " + str2);

        // 3. replace substr
        String lang1 = "会不会玩?你大爷的!你大爷的!";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println("lang2 = " + lang2);

    }
}

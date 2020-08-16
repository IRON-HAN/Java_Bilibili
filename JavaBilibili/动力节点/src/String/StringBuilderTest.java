package String;

/**
 * @Description:
 * @Author Pcy
 * @Date: 20/7/15 23:41
 */

/*
 * ★: 拼接字符串时, 使用StringBuilder的append方法以节省空间开销
 * */
public class StringBuilderTest
{
    public static void main(String[] args)
    {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("a");
        stringBuilder.append(3.14);
        stringBuilder.append(false);

        System.out.println("stringBuilder = " + stringBuilder);
    }
}


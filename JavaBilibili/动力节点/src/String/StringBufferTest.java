package String;

/**
 * @Description: Tell the difference between StringBuffer & StringBuilder
 * @Author Pcy
 * @Date: 20/7/15 23:34
 */
/*
 * StringBuffer--线程安全
 * StringBuilder--非线程安全
 * */
public class StringBufferTest
{
    public static void main(String[] args)
    {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("a");
        stringBuffer.append(3.14);
        stringBuffer.append(true);

        System.out.println("stringBuffer = " + stringBuffer);

    }
}


package IO;

import java.io.*;

/**
 * @description: 缓冲流
 * @author: Pcy
 * @date: 20/7/18 9:17
 */
public class BufferedReaderTest
{
    public static void main(String[] args)
    {
        String file = "123.txt";

        try
        {
            // 在ctor中作为参数的是:"节点流" 被构造的是: "包装流"
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String s = null;
            // Note: readLine不会自动读取"\n"
            while ((s = br.readLine()) != null)
                System.out.println(s);

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


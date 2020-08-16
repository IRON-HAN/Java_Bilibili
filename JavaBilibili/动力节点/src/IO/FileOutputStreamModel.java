package IO;

import java.io.*;

/**
 * @description:
 * @author: Pcy
 * @date: 20/7/17 18:46
 */
public class FileOutputStreamModel
{
    public static void main(String[] args)
    {
        String fileName = "E:\\1_JB\\JAVA\\黑马(B站)\\动力节点\\src\\IO\\Files\\test4.txt";
        String s = "abc def";
        outToFile(fileName, s);
    }

    public static void outToFile(String fileName, String s)
    {
        try (
                FileOutputStream fos = new FileOutputStream(fileName, true)
        )
        {
            byte[] bytes = s.getBytes();
            fos.write(bytes);
            fos.flush();
            System.out.println("success");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


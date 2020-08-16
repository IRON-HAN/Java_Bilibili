package IO;

import java.io.*;

/**
 * @description: 文件读入的模板(对象流除外)
 * @author: Pcy
 * @date: 20/7/17 17:08
 */
public class FileInputStreamModel
{
    public static void main(String[] args)
    {
        String filename = "E:\\1_JB\\JAVA\\黑马(B站)\\src\\IO\\Files\\test1.txt";
        inToStream(filename);
    }

    public static void inToStream(String fileName)
    {
        try (
                FileInputStream fis = new FileInputStream(fileName)
        )
        {
            byte[] bytes = new byte[4];
            int cnt;
            while ((cnt = fis.read(bytes)) != -1)
                System.out.println(new String(bytes, 0, cnt));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


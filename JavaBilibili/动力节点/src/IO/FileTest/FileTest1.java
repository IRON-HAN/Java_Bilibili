package IO.FileTest;

import java.io.*;

/**
 * @description: 创建文件与创建目录
 * @author: Pcy
 * @date: 20/7/18 10:08
 */
public class FileTest1
{
    public static void main(String[] args)
    {
        File f1 = new File("D:/f1.txt");

        if (!f1.exists())
        {
            try
            {
                f1.createNewFile();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        File f2 = new File("D:/f2");
        if (!f2.exists())
            f2.mkdir();

        File f3 = new File("D:/f3/test");
        if (!f3.exists())
            f3.mkdirs();

    }
}


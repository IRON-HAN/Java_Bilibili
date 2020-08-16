package IO.FileTest;

import java.io.File;

/**
 * @description: 获取路径下的所有文件名
 * @author: Pcy
 * @date: 20/7/18 10:24
 */
public class FileTest2
{
    public static void main(String[] args)
    {
        File file = new File("D:\\gitclone");
        File[] files = file.listFiles();

        for (File f : files)
            System.out.println(f.getName());
    }
}


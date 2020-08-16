package IO;

import java.io.*;

public class Copy
{
    public static void main(String[] args)
    {
        copyDir(new File("D:/test_dst"), new File("D:/test_src"));
    }

    /**
     * @description: copy a single file
     * @param: destination file
     * @param: source file
     * @return: void
     * @throws: None
     * @author: Pcy
     * @date: 20/7/17 23:06
     */
    public static void copySingle(String dst, String src)
    {
        try (
                FileInputStream in = new FileInputStream(src);
                FileOutputStream out = new FileOutputStream(dst);
        )
        {
            byte[] bytes = new byte[1024];
            int cnt;
            while ((cnt = in.read(bytes)) != -1)
                out.write(bytes, 0, cnt);
            out.flush();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * @description: copyDir
     * @param: dst
     * @param: src
     * @return: void
     * @throws: None
     * @author: Pcy
     * @date: 20/7/18 11:10
     */
    public static void copyDir(File dst, File src)
    {
        if (src.isDirectory())
        { // 如果源文件(的子目录)是目录
            if (!dst.exists())
                dst.mkdir(); // 在目标目录下创建对应的子目录
            String[] files = src.list(); // 获取该目录下的所有文件/子目录
            assert files != null;
            for (String file : files)
            { // 遍历该目录下的所有文件/子目录
                File srcFile = new File(src, file); // 通过每个子文件/子目录创建srcFile对象
                File dstFile = new File(dst, file); // 通过每个子文件/子目录创建dstFile对象
                copyDir(dstFile, srcFile); // 递归调用
            }
        }
        else // 如果源文件是文件-->执行单文件的拷贝操作
            copySingle(dst.getAbsolutePath(), src.getAbsolutePath());
        System.out.println("success!");
    }
}


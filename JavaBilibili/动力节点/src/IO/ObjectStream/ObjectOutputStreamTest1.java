package IO.ObjectStream;

import java.io.*;

/**
 * @description: 向流写入对象
 * @author: Pcy
 * @date: 20/7/18 11:30
 */
public class ObjectOutputStreamTest1
{
    public static void main(String[] args) throws IOException
    {
        // 1. 创建obj
        Test test = new Test("test1");

        // 2. 创建流
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));

        // 3. 序列化对象
        out.writeObject(test);

        // 4. 刷新
        out.flush();

        // 5. 关闭
        out.close();
    }
}




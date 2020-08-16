package IO.ObjectStream;

import java.io.*;

/**
 * @description: 从流中读取对象
 * @author: Pcy
 * @date: 20/7/18 11:56
 */
public class ObjectInputStreamTest2
{
    public static void main(String[] args) throws Exception
    {
        // 1. 创建对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
        // 2. 反序列化
        Object o = in.readObject();
        System.out.println("o = " + o);
        // 3. 关闭流
        in.close();
    }
}


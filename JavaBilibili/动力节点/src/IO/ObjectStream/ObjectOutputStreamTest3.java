package IO.ObjectStream;

import java.io.*;
import java.util.*;

/**
 * @description: 向流写入对象的集合
 * @author: Pcy
 * @date: 20/7/18 12:03
 */
public class ObjectOutputStreamTest3
{
    public static void main(String[] args) throws Exception
    {
        List<Test> tests = new ArrayList<>();
        tests.add(new Test("1"));
        tests.add(new Test("2"));
        tests.add(new Test("3"));

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tests.txt"));

        // 序列化一个集合
        out.writeObject(tests);

        out.flush();
        out.close();

    }
}


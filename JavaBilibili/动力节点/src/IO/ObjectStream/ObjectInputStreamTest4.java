package IO.ObjectStream;

import java.io.*;
import java.util.List;

/**
 * @description: 从流中读取对象集合
 * @author: Pcy
 * @date: 20/7/18 12:06
 */
public class ObjectInputStreamTest4
{
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("tests.txt"));
        List<Test> tests = (List<Test>) in.readObject();
        for (Test test : tests)
            System.out.println("test = " + test);
        in.close();
    }
}


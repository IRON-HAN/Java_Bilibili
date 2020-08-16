package Collection.SUMUP.Demo;

import java.util.*;
// 注意: 没有[]的访问方式而是用get

/**
 * @description: ArrayListTest
 * 常用的API和遍历操作
 * @version: 1.0
 * @date: 20/8/15 9:29
 */
public class ArrayListTest
{
    public static void main(String[] args)
    {
        // 1. 创建

        List<String> strings = new ArrayList<>();

        // 2. 添加
        strings.add("a");
        strings.add("v");
        strings.add("gh");

        // 3. 取出
        System.out.println("strings.get(1) = " + strings.get(1));
        // 4. 遍历
        // 4.1. fori
        for (int i = 0; i < strings.size(); i++)
        {
            System.out.println("i = " + i);
            System.out.println("strings.get(i) = " + strings.get(i));
        }
        // 4.2. foreach
        for (String s : strings)
            System.out.println("s = " + s);
        // 4.3. iterator
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); )
            System.out.println("iterator.next() = " + iterator.next());
    }
}

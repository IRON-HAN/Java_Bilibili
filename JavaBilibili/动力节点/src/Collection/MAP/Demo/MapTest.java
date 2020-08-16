package Collection.MAP.Demo;

import java.util.*;

/**
 * @description: 列举map常用API
 * @version: 1.0
 * @date: 20/8/15 9:04
 */
public class MapTest
{
    public static void main(String[] args)
    {
        Map< Integer, String > map = new HashMap<>();
        // 1. put
        map.put(1, "zhang");
        map.put(2, "li");
        map.put(1, "san"); // 会覆盖前一个value
        // 2. get ★(by key)
        System.out.println(map.get(1));
        // 3. remove (by key)
        System.out.println(map.remove(2));
        // 4. contains : 内部调用equals方法
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("zhang"));
    }
}

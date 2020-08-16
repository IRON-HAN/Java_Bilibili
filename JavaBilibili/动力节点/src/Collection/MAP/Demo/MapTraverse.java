package Collection.MAP.Demo;

import java.util.*;

/**
 * @description: 遍历map的方法
 * @version: 1.0
 * @date: 20/8/15 9:05
 */
public class MapTraverse
{
    public static void main(String[] args)
    {
        Map< Integer, String > map = new HashMap<>();
        map.put(1, "zhang");
        map.put(2, "li");
        // 1. ★ 转成Set之后进行遍历
        Set< Map.Entry< Integer, String > > set = map.entrySet();
        for (Map.Entry< Integer, String > node : set)
            System.out.println(node);
        // 2. 取出key的集合 通过遍历key获取value
        Set< Integer > keys = map.keySet();
        for (Integer key : keys)
        {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }
    }
}

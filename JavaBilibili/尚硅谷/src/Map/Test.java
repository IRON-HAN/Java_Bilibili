package Map;

import java.util.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/7 10:44
 */
public class Test
{
    public static void main(String[] args)
    {
        Map map = new HashMap();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        // 1. entrySet
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext())
        {
            Object o = iterator.next();
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        // 2. keySet
        Set keySet = map.keySet();
        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext())
        {
            Object k = iterator1.next();
            Object v = map.get(k);
            System.out.println(k + "--" + v);
        }
    }
}


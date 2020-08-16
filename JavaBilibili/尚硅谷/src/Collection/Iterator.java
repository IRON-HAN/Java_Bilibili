package Collection;

import java.util.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/6 19:09
 */
public class Iterator
{
    public static void main(String[] args)
    {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(123);
        java.util.Iterator iterator = collection.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        java.util.Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext())
        {
            Object o = iterator1.next();
            if (new Integer(456).equals(o))
                iterator1.remove();
        }
        java.util.Iterator iterator3 = collection.iterator();
        while (iterator3.hasNext())
            System.out.println(iterator3.next());
    }
}


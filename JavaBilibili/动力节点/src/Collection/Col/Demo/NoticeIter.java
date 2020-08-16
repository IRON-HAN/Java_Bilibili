//  ★: 如何用iterator移除集合中的元素
//  1. 如果集合发生变化,则iterator需要重新获取,
//  iterator在原集合的副本上进行操作
//  2. iterator.next() + collection.remove()
//  该方法不可行
//  3. ★ 用iterator.remove()

package Collection.Col.Demo;

import java.util.*;

public class NoticeIter
{
    public static void main(String[] args)
    {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
//        Iterator iterator=collection.iterator();
//        * 此处不重新获取iterator --> exception
//        while (iterator.hasNext())
//        {
//            Object object= iterator.next();
//            System.out.println("object = " + object);
//        }
//        while (iterator.hasNext())
//        {--> exception
//            collection.remove(iterator.next());
//        }
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext())
        {
            Object o = iterator1.next();
            iterator1.remove();
            System.out.println("o = " + o);
        }
    }
}

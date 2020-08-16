package Collection;

import java.util.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/6 17:47
 */
public class Contains
{
    public static void main(String[] args)
    {
        Collection collection = new ArrayList();
        collection.add("T");
        collection.add(new Person("A"));
        System.out.println(collection.contains("T")); //true
        System.out.println(collection.contains(new Person("A"))); // false
//        原因: 没有重新equals方法
    }
}

class Person
{
    String name;

    public String getName()
    { return name; }

    public void setName(String name)
    { this.name = name; }

    public Person(String name)
    {
        this.name = name;
    }
}
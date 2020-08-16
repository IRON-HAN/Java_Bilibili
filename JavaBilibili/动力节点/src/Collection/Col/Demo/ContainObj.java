package Collection.Col.Demo;

import java.util.*;

/**
 * @description: contains和remove都会通过equals方法判断
 * @version: 1.0
 * @date: 20/8/15 9:06
 */
public class ContainObj
{
    public static void main(String[] args)
    {
        Collection c = new ArrayList();
        User user1 = new User("jack");
        User user2 = new User("jack");
        c.add(user1);
        System.out.println("c.size() = " + c.size());
        System.out.println("c.contains(user2) = " + c.contains(user2));
        System.out.println("user1.equals(user2) = " + user1.equals(user2));
        c.remove(user2);
        System.out.println("c.size() = " + c.size());
    }
}

class User
{ // 重写equals方法!!! 变比较"地址"为比较"内容"
    private String name;

    public User(String name)
    { this.name = name; }

    public User()
    { }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode()
    { return Objects.hash(name); }
}
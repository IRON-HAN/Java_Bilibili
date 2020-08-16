
package Collection.MAP.Demo;

import java.util.*;
/**
 * @description: ★ 作为hashmap key部分的自定义类型必须写equals和hashcode
 * @version: 1.0
 * @date: 20/8/15 9:09
 */
public class HashMapTest02
{
    public static void main(String[] args)
    {
        // StudentA no-equals和hashcode
        StudentA student01 = new StudentA("zh");
        StudentA student02 = new StudentA("zh");
        // 1. equals
        System.out.println("student01.equals(student02)=" + student01.equals(student02));
        // 2. hashcode
        System.out.println("student01.hashCode()=" + student01.hashCode());
        System.out.println("student02.hashCode()=" + student02.hashCode());
        // 3. hashSet
        Set< StudentA > student01s = new HashSet<>();
        student01s.add(student01);
        student01s.add(student02);
        System.out.println("student01s.size()=" + student01s.size());
        System.out.println("-----------------");
        // StudentB equals和hashcode
        StudentB student03 = new StudentB("zh");
        StudentB student04 = new StudentB("zh");
        // 1. equals
        System.out.println("student03.equals(student04)=" + student03.equals(student04));
        // 2. hashcode
        System.out.println("student03.hashCode()=" + student03.hashCode());
        System.out.println("student04.hashCode()=" + student04.hashCode());
        // 3. hashSet
        Set< StudentB > studentBS = new HashSet<>();
        studentBS.add(student03);
        studentBS.add(student04);
        System.out.println("student02s.size()=" + studentBS.size());
    }
}

class StudentA
{
    private String name;

    public StudentA()
    { }

    public StudentA(String name)
    { this.name = name; }

    public String getName()
    { return name; }

}

class StudentB
{
    private String name;

    public StudentB(String name)
    { this.name = name; }

    public StudentB()
    { }

    public String getName()
    { return name; }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (!(o instanceof StudentB))
            return false;
        StudentB studentB = (StudentB) o;
        return Objects.equals(getName(), studentB.getName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getName());
    }
}
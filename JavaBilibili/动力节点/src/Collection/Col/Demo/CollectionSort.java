package Collection.Col.Demo;

import java.util.*;

/**
 * @description: 集合中实现自定义类型的排序
 * @version: 1.0
 * @date: 20/8/15 9:06
 */
public class CollectionSort
{
    public static void main(String[] args)
    {
        List< String > list = new ArrayList<>();
        // EX1: 内置的String类型排序
        list.add("a");
        list.add("c");
        list.add("b");
        Collections.sort(list);
        for (String s : list)
            System.out.println("s = " + s);
        System.out.println("--------------");
        // EX2: 自定义类型排序
        List< Cat > cats = new ArrayList<>();
        cats.add(new Cat(11));
        cats.add(new Cat(10));
        cats.add(new Cat(12));
        // 法1: Cat 实现 Comparable接口
        Collections.sort(cats);
        for (Cat c : cats)
            System.out.println("c = " + c);
        System.out.println("--------------");
        // 法2: use Comparator
        // 可以自己任意定义比较规则, 更加灵活
        Collections.sort(cats, new CatComparator());
        for (Cat c : cats)
            System.out.println("c = " + c);
        System.out.println("--------------");
        // lambda写法
        Collections.sort(cats, (o1, o2) -> o2.compareTo(o1));
        for (Cat c : cats)
            System.out.println("c = " + c);
        System.out.println("--------------");
        // EX3: 对Set的排序-->先转List后排序
        Set< String > strings = new HashSet<>();
        strings.add("c");
        strings.add("a");
        strings.add("f");
        List< String > stringList = new ArrayList<>(strings);
        Collections.sort(stringList);
        for (String s : stringList)
            System.out.println("s = " + s);
    }
}

class Cat implements Comparable< Cat >
{
    int age;

    public Cat(int age)
    { this.age = age; }

    @Override
    public String toString()
    { return "Cat{" + "age=" + age + '}'; }

    @Override
    public int compareTo(Cat that)
    { return this.age - that.age; }
}

class CatComparator implements Comparator< Cat >
{

    @Override
    public int compare(Cat o1, Cat o2)
    { return o2.compareTo(o1); }
}
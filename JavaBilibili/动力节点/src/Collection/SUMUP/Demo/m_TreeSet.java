package Collection.SUMUP.Demo;

import java.util.*;

/**
 * @description: * 1. 不能通过index访问(无序)
 * * 2. 不可重复
 * * 3. 可排序(自动)
 * 4. new TreeSet的时候, 如果是没有实现comparable的自定义类型
 * 可以通过传递comparator, 让Treeset实现自动排序
 * 5. 但是, 如果本身实现了comparable, 则传递comparator无用
 * 下面的例子证实了这一点
 * @version: 1.0
 * @date: 20/8/15 9:39
 */
public class m_TreeSet
{
    public static void main(String[] args)
    {
        System.out.println("students------------");
        // 1. 无比较器的初始化
        Set< Student > students = new TreeSet<>();
        students.add(new Student("1"));
        students.add(new Student("6"));
        students.add(new Student("3"));
        for (Student student : students)
            System.out.println("student = " + student);
        System.out.println("students3------------");
        // 3. 给了比较器的初始化
        Set< Student > students3 = new TreeSet<>((o1, o2) -> o1.compareTo(o2));
        students3.add(new Student("1"));
        students3.add(new Student("6"));
        students3.add(new Student("3"));
        for (Student student : students)
            System.out.println("student = " + student);
    }
}

class Student implements Comparable< Student >
{
    String name;

    public Student(String name)
    { this.name = name; }

    @Override
    public String toString()
    { return "Student{" + "name='" + name + '\'' + '}'; }

    @Override
    public int compareTo(Student that)
    { return -this.name.compareTo(that.name); }
}

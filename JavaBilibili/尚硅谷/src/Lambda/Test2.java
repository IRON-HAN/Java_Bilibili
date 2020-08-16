package Lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;
/**
 * @description: 1. 对象 :: 非静态方法
 * 2. 类 :: 静态方法
 * 3. 类 :: 非静态方法
 * @author: Pcy
 * @date: 20/8/9 22:29
 */
public class Test2
{
    public static void main(String[] args)
    {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    // 1. 对象 :: 非静态方法
    public static void test1()
    {
        Consumer< String > consumer = (s) -> System.out.println(s);
        consumer.accept("123");
        System.out.println("***********************");
        PrintStream ps = System.out;
        Consumer< String > consumer1 = ps::println;
        consumer1.accept("456");
    }

    // 2. 类 :: 静态方法
    public static void test2()
    {
        Comparator< Integer > comparator = (t1, t2) ->
        {
            return Integer.compare(t1, t2);
        };
        System.out.println(comparator.compare(11, 12));
        System.out.println("******************");
        Comparator< Integer > comparator1 = Integer::compare;
        System.out.println(comparator1.compare(11, 12));
    }

    public static void test3()
    {
        Function< Double, Long > function = (d) ->
        {
            return Math.round(d);
        };
        System.out.println(function.apply(12.5));
        System.out.println("*******************");
        Function< Double, Long > function1 = Math::round;
        System.out.println(function1.apply(12.5));
    }

    // 3. 类 :: 非静态方法
    public static void test4()
    {
        Comparator< String > comparator = (s1, s2) ->
        {
            return s1.compareTo(s2);
        };
        System.out.println(comparator.compare("ab", "ac"));
        System.out.println("******************");
        Comparator< String > comparator1 = String::compareTo;
        System.out.println(comparator.compare("ab", "ac"));
    }

    public static void test5()
    {
        BiPredicate< String, String > predicate = (s1, s2) ->
        {
            return s1.equals(s2);
        };
        System.out.println(predicate.test("123", "123"));
        System.out.println("****************");
        BiPredicate< String, String > predicate1 = String::equals;
        System.out.println(predicate1.test("123", "123"));
    }
}


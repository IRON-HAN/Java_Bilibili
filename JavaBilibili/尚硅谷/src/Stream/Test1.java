package Stream;

import java.util.stream.Stream;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/10 8:59
 */
public class Test1
{
    public static void main(String[] args)
    {
        test1();
    }

    public static void test1()
    {
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}


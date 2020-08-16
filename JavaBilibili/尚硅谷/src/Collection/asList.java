package Collection;

import java.util.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/6 18:28
 */
public class asList
{
    public static void main(String[] args)
    {
        List< String > list = Arrays.asList("AA", "BB", "CC");
        System.out.println(list);
        List arr1 = Arrays.asList(new int[] { 123, 456 });
        System.out.println("arr1.size() = " + arr1.size());
//        System.out.println(arr1);
        Object o = arr1.get(0);
        List arr2 = Arrays.asList(new Integer[] { 123, 456 });
        System.out.println("arr2.size() = " + arr2.size());
        System.out.println(arr2);
        List arr3 = Arrays.asList(123, 456);
        System.out.println("arr3.size() = " + arr3.size());
        System.out.println(arr3);
    }
}


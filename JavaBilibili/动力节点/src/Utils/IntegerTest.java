package Utils;

/**
 * @description: IntegerTest
 * The conversion between "int(Integer)" & "String"
 * @version: 1.0
 * @date: 20/8/15 9:53
 */
public class IntegerTest
{
    public static void main(String[] args)
    {
        // 1. int --> Integer
        int i1 = 10;
        Integer integer1 = i1;

        // 2. Integer --> int
        Integer integer2 = 100;
        int i2 = integer2;

        // 3. int --> String
        int i3 = 100;
        String s3 = i3 + "";
        System.out.println(s3 + 1); // "100"+"1"

        // 4. String --> int
        int i4 = Integer.parseInt("50");
        System.out.println(i4 + 1);// 50+1

        // 5. String --> Integer
        Integer integer5 = Integer.valueOf("123");

        // 6. Integer --> String
        String s6 = String.valueOf(integer5);
    }
}


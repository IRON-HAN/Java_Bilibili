package Utils;

import java.math.BigDecimal;

/**
 * @description: BigDecimalTest
 * 替换double类型
 * @version: 1.0
 * @date: 20/8/15 9:50
 */
public class BigDecimalTest
{
    public static void main(String[] args)
    {
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal2 = new BigDecimal(200);

        System.out.println("bigDecimal.add(bigDecimal2) = " + bigDecimal.add(bigDecimal2));

        System.out.println("bigDecimal.divide(bigDecimal2) = " + bigDecimal.divide(bigDecimal2));

    }
}


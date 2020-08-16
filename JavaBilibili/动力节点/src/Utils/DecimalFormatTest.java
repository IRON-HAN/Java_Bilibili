package Utils;

import java.text.DecimalFormat;

/**
 * @description: DecimalFormatTest
 *  * 数字格式
 *  * 1. # 表示任意数字
 *  * 2. , 表示千分位
 *  * 3. . 表示小数点
 *  * 4. 0 不够位数补0
 * @version: 1.0
 * @date: 20/8/15 9:53
 */
public class DecimalFormatTest
{
    public static void main(String[] args)
    {
        DecimalFormat df = new DecimalFormat("###,###.##");
        String string = df.format(1234.356764);
        System.out.println("string = " + string); // 1,234.36

        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String string1 = df2.format(1234.56);
        System.out.println("string1 = " + string1); // 1,234.5600
    }
}


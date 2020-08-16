package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: DateTest01
 * 使用SimpleDateFormat, 改变Date对象的显示方式
 * @version: 1.0
 * @date: 20/8/15 9:51
 */
public class DateTest01
{
    public static void main(String[] args) throws Exception
    {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String string = sdf.format(date);
        System.out.println("string = " + string);

        String string1 = "2020-07-16";
        Date date1 = sdf.parse(string1);
        System.out.println("date1 = " + date1);
    }
}


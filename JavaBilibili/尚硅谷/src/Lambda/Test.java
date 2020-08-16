package Lambda;

import java.util.function.Consumer;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/9 21:48
 */
/*
 * -> 左边: 形参列表: 类型可以省略(类型推断)
 * -> 右边: 方法体(最好用{}包裹)
 * */
public class Test
{
    public static void main(String[] args)
    {
        test1();
    }

    public static void test1()
    {
        consume(100, new Consumer< Double >()
        {
            @Override
            public void accept(Double aDouble)
            {
                System.out.println("价格 = " + aDouble);
            }
        });
        System.out.println("**********************");
        consume(200, (money) -> System.out.println("价格 = " + money));
    }

    public static void consume(double money, Consumer< Double > consumer)
    {
        consumer.accept(money);
    }
}


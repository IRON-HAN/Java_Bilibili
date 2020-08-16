package Threads;

import java.util.concurrent.*;

/**
 * @description: Callable
 * 1. 优点: 可以获取返回值
 * 2. 缺点: 造成线程阻塞, 效率降低
 * @author: Pcy
 * @date: 20/7/19 10:32
 */
public class Demo07
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        FutureTask task = new FutureTask(new Callable()
        {
            @Override
            public Object call() throws Exception
            {
                System.out.println("method begin");
                Thread.sleep(1000 * 3);
                System.out.println("method end");
                return (100 + 200);
            }
        });

        Thread thread = new Thread(task);
        thread.start();

        Object o = task.get();
        System.out.println("o = " + o);

        System.out.println("hello world");
    }
}


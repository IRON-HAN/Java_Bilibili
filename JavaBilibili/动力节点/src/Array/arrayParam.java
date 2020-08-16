package Array;

public class arrayParam
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        printArray(a);
        // 如果直接传递一个静态匿名数组, []里面不能带数字
        printArray(new int[]{4, 5, 6});
    }

    public static void printArray(int[] array)
    {
        for (int elem : array)
            System.out.println("elem = " + elem);
    }
}

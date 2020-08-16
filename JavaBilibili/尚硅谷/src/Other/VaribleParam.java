package Other;

/**
 * @description: 传递不定长的参数
 * 1. 写法
 * 2. overload
 * 3. 一个方法只能声明一个可变形参, 且必须在末尾
 * @author: Pcy
 * @date: 20/7/28 10:21
 */
public class VaribleParam
{
    public static void main(String[] args)
    {
        show("a", "b", "c");
    }

    public static void show(String s)
    { System.out.println("VaribleParam.show(String s)"); }

    // 在方法中 对strings的操作和数组完全一致
    public static void show(String... strings)
    {
        System.out.println("VaribleParam.show(String ... strings)");
        for (int i = 0; i < strings.length; i++)
            System.out.println("strings[i] = " + strings[i]);
    }
//    public static void show(String[]strings){}
//     Error : duplicates
}


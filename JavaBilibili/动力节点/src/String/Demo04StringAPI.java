/* String
 * 1. indexOf
 * 2. substring
 * */

package String;

public class Demo04StringAPI
{
    public static void main(String[] args)
    {
        // 1. 查找子串的位置
        // 找到--返回第一个下标
        // 找不到--返回-1
        String string = "hello world";
        int index = string.indexOf("llo");
        System.out.println("index = " + index);

        // 2. 截取子串
        String sub1 = string.substring(5);// 从该下标到结尾
        System.out.println("sub1 = " + sub1);
        String sub2 = string.substring(4, 7);// [beg,end)
        System.out.println("sub2 = " + sub2);

    }
}

/*成员变量/方法的访问方式
 * 0. 分类: class内/外 实例/static
 * ★
 * 1. class内: this/类名 可以省略
 * 2. 实例: 引用.name | static: 类名.name
 *
 * */

package Memory.Demos;

public class MemberAccess
{
    int i = 1;
    static int j = 2;

    public static void main(String[] args)
    { // 注意: main方法是static, 没有"this", 可以自动添加"类名"

        // 1.  实例方法
//      m1();
//      Error: main是static无法添加"this",也没有一个对象的引用
        new MemberAccess().m1();

        // 2.  静态方法
        m2();
        MemberAccess.m2();

        // 3.  实例变量
//      System.out.println("i = " + i);
//      Error: main是static无法添加"this",也没有一个对象的引用
        System.out.println("i = " + new MemberAccess().i);

        // 4.  静态变量
        System.out.println("j = " + j);
        System.out.println("j = " + MemberAccess.j);

        // 5. 类外访问

        // 静态
        T.t2();

        // 实例
        new T().t1();

    }

    public void m1() // 实例方法
    {
        System.out.println("m1()");
    }

    public static void m2() // 静态方法
    {
        System.out.println("m2()");
    }

    public void Test()
    {
        // 1.  实例方法
        m1();
        this.m1();

        // 2.  静态方法
        m2();
        MemberAccess.m2();

        // 3.  实例变量
        System.out.println("i = " + i);
        System.out.println("i = " + this.i);

        // 4.  静态变量
        System.out.println("j = " + j);
        System.out.println("j = " + MemberAccess.j);
    }
}

class T
{
    public void t1()
    {
        System.out.println("t1()");
    }

    public static void t2()
    {
        System.out.println("t2()");
    }

}
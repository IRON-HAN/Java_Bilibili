/*
1. 成员变量的访问[口诀]
// 编译看左边,父类有-->通过,没有-->不通过
// 运行看左边,子类无法覆盖
2. 成员方法的访问[口诀]
// 编译看左边,父类有-->通过,没有-->不通过
// 运行看右边,同名的情况下子类override
*/

package OOP.Upcast;

public class Demo02
{
    public static void main(String[] args)
    {
        Base base = new Base();

        Derived derived = new Derived();

        Base obj = new Derived();

        // 父类对象只能使用父类的成员
        System.out.println("base.numBase = " + base.numBase);

        // 子类对象直接访问父类定义的成员变量[子类中没定义,向上找]
        System.out.println("derived.numBase = " + derived.numBase);

        // 子类对象访问自己的成员变量
        System.out.println("derived.numDerived = " + derived.numDerived);

        // 初始化左侧是子类,所以用的还是子类
        System.out.println("derived.num = " + derived.num);

        // 子类对象访问子类的特有的方法
        derived.methodDerived();

        // 子类对象访问父类的方法(向上找)
        derived.methodBase();

        // 子类访问自己override的方法
        derived.method();

        // -----------------------------------------------
        // upcast:
        // 成员变量
        // 编译看左边,父类有-->通过,没有-->不通过
        // 运行看左边,子类无法覆盖
        System.out.println("obj.num = " + obj.num);
        System.out.println("obj.numBase = " + obj.numBase);
//        System.out.println(obj.Derived); // error!

        // 成员方法
        // 编译看左边,父类有-->通过,没有-->不通过
        // 运行看右边,同名的情况下子类override
        obj.method();
        obj.methodBase();
//        obj.methodDerived(); // error!

    }
}

class Base
{
    int numBase = 10;
    int num = 1;

    public void methodBase()
    {
        System.out.println("num = " + num);
    }

    public void method()
    {
        System.out.println("numBase = " + numBase);
        System.out.println("num = " + num);
    }
}

class Derived extends Base
{
    int numDerived = 20;
    int num = 2;

    public void methodDerived()
    {
        System.out.println("num = " + num);
    }

    public void method()
    {
        int num = 3;
        System.out.println("num = " + num);// local
        System.out.println("this.num = " + this.num); // derived
        System.out.println("super.num = " + super.num); // base
    }
}
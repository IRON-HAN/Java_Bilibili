/*
 *   Upcast
 * 1. 编译时: 寻找该方法是否是父类的方法(如果存在,则通过编译)
 * 2. 运行时: 判定heap中的类型,调用同名的子类方法
 * */

package OOP.Upcast;

public class Demo01
{
    public static void main(String[] args)
    {
        Animal b = new Bird(); //向上转型
        b.eat();
        //  b.fly();
        //  upcast 的代价是: 不能调用子类特有方法
        sleep(new Male());
        sleep(new Female());
    }

    public static void sleep(Human human)
    {
        human.sleep();
    }

}

class Animal
{
    public void eat()
    {
        System.out.println("父类的 eating...");
    }
}

class Bird extends Animal
{
    @Override
    public void eat()
    {
        System.out.println("子类重写的父类的  eating...");
    }

    public void fly()
    {
        System.out.println("子类特有  flying...");
    }
}

class Human
{
    public void sleep()
    {
        System.out.println("父类人类   sleep..");
    }
}

class Male extends Human
{
    @Override
    public void sleep()
    {
        System.out.println("子类男人 sleep..");
    }
}

class Female extends Human
{
    @Override
    public void sleep()
    {
        System.out.println("子类女人 sleep..");
    }
}
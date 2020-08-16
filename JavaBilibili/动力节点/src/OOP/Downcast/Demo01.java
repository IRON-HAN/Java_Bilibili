/*
 * 不管cast的类型, 同名方法时, 根据heap中的类型判定
 * */

package OOP.Downcast;

public class Demo01
{
    public static void main(String[] args)
    {
        Fruit a = new Apple(); //upcast: Apple-->Fruit
        a.myName();// 子类的方法

        Apple aa = (Apple) a; //downcast: Fruit(Apple)-->Apple
        aa.myName();// 子类的方法
        aa.myMore();// 子类特有的方法


//        Fruit f = new Fruit();
//        Apple aaa = (Apple) f; //downcast: Fruit-->Apple
//        aaa.myName();
//        aaa.myMore();
    }

}

class Fruit
{
    public void myName()
    {
        System.out.println("父类  水果...");
    }
}

class Apple extends Fruit
{
    @Override
    public void myName()
    {
        System.out.println("子类  苹果...");
    }

    public void myMore()
    {
        System.out.println("我是你的小呀小苹果~~~~~~");
    }
}

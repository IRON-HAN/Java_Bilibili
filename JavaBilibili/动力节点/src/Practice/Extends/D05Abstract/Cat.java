package Practice.Extends.D05Abstract;

public class Cat extends Animal
{

    @Override
    public void eat()
    {
        System.out.print("猫吃鱼\n");
    }

    @Override
    public void sleep()
    {
        System.out.print("猫睡觉\n");
    }

    public Cat()
    {
        System.out.print("Cat()\n");
    }
}

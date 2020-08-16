package Array;

public class ArrayWithOOP
{
    public static void main(String[] args)
    {
        Animal[] animals = { new Cat(), new Bird() };
        introduce(animals);
        move(animals);
    }

    /**
     * @description: introduce : 调用所有对象的introduce方法(父类)
     * @param: animals : Animal对象的数组
     * @return: void
     * @throws: None
     * @date: 20/8/15 7:57
     */
    public static void introduce(Animal[] animals)
    {
        for (Animal a : animals)
            a.introduce();
    }

    /**
     * @description: move : 调用子类特有的方法
     * @param: animals : Animal对象的数组
     * @return: void
     * @throws: None
     * @date: 20/8/15 7:59
     */
    public static void move(Animal[] animals)
    {
        for (Animal a : animals)
        {
            if (a instanceof Cat)
                ((Cat) a).run();
            if (a instanceof Bird)
                ((Bird) a).fly();
        }
    }
}

abstract class Animal
{
    public Animal()
    { }

    public abstract void introduce();
}

class Cat extends Animal
{

    public Cat()
    { }

    @Override
    public void introduce()
    { System.out.println("I am Cat"); }

    public void run()
    { System.out.println("running"); }
}

class Bird extends Animal
{

    public Bird()
    { }

    @Override
    public void introduce()
    { System.out.println("I am bird"); }

    public void fly()
    { System.out.println("flying"); }
}
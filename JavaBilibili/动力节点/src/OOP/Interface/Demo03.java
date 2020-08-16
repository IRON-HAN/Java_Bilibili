package OOP.Interface;

public class Demo03
{
    public static void main(String[] args)
    {
        Flyable flyable = new Cat();
        flyable.fly();

    }
}

class Animal
{
}

interface Flyable
{
    void fly();
}

class Cat extends Animal implements Flyable
{
    @Override
    public void fly()
    {
        System.out.println("cat flying");
    }
}

class Snake extends Animal
{
}

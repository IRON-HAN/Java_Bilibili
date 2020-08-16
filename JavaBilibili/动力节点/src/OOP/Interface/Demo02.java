package OOP.Interface;

public class Demo02
{
    public static void main(String[] args)
    {
        A a = new D();
        B b = new D();

        B b2 = (B) a;
        b2.m2();

        ((B) a).m2();
        ((D) a).m2();
    }
}

interface A
{
    void m1();
}

interface B
{
    void m2();
}

class D implements A, B
{
    @Override
    public void m1()
    {
        System.out.println("m1()");
    }

    @Override
    public void m2()
    {
        System.out.println("m2()");
    }
}

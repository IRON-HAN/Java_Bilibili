package OOP.ThisSuper;

public class Demo01
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}

class A
{
    public A()
    {
        System.out.println("A()");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("B()");
    }

    public B(String s)
    {
        System.out.println("B(String s)");
    }
}

class C extends B
{
    public C(String s, int i)
    {
        super(s);
        System.out.println("C(String s,int i)");
    }

    public C(String s)
    {
        this(s, 20);
        System.out.println("C(String s)");
    }

    public C()
    {
        this("li");
        System.out.println("C()");
    }
}

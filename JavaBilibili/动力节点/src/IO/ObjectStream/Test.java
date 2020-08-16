package IO.ObjectStream;

import java.io.Serializable;

/**
 * @description:
 * @author: Pcy
 * @date: 20/7/18 11:57
 */
public class Test implements Serializable
{
    private static final long serialVersionUID = 9194511326982854637L;

    String name;

    public Test(String name)
    { this.name = name; }

    public Test()
    { }

    public String getName()
    { return name; }

    @Override
    public String toString()
    { return "Test{" + "name='" + name + '\'' + '}'; }
}


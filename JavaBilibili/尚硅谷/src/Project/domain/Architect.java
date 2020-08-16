package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:28
 */
public class Architect extends Designer
{
    private int stock;

    public Architect()
    { }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus,
                     int stock
    )
    {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Architect{" +
               "stock=" + stock +
               "} ";
    }
}


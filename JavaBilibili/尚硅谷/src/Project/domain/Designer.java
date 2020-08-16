package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:27
 */
public class Designer extends Programmer
{
    private double bonus;

    public Designer()
    { }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus)
    {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Designer{" +
               "bonus=" + bonus +
               "} ";
    }
}


package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:12
 */
public class Printer implements Equipment
{
    private String name;
    private String type;

    public Printer()
    {
    }

    public Printer(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription()
    {
        return name + "(" + type + ")";
    }
}


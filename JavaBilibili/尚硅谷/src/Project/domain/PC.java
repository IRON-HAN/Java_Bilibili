package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:06
 */
public class PC implements Equipment
{
    private String model;
    private String display;

    public PC()
    { }

    public PC(String model, String display)
    {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription()
    {
        return model + "(" + display + ")";
    }
}


package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:11
 */
public class NoteBook implements Equipment
{
    private String model;
    private double price;

    public NoteBook()
    {
    }

    public NoteBook(String model, double price)
    {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription()
    {
        return model + "(" + price + ")";
    }
}


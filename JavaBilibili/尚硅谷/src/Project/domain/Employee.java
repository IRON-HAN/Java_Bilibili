package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:15
 */
public class Employee
{
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee()
    { }

    public Employee(int id, String name, int age, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId()
    { return id; }

    public String getName()
    { return name; }

    public int getAge()
    { return age; }

    public double getSalary()
    { return salary; }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}


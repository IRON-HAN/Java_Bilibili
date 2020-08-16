package Project.domain;

/**
 * @description:
 * @author: Pcy
 * @date: 20/8/12 18:16
 */
public class Programmer extends Employee
{
    private int memberID;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Status getStatus()
    { return status; }

    public void setStatus(Status status)
    { this.status = status; }

    public int getMemberID()
    { return memberID; }

    public Programmer()
    { }

    public Programmer(int id, String name, int age, double salary, Equipment equipment)
    {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Programmer{" +
               "status=" + status +
               ", " + equipment.getDescription() +
               "} ";
    }

    public void setMemberID(int memberID)
    { this.memberID = memberID; }
}


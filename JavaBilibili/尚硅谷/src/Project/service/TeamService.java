package Project.service;

import Project.domain.*;

import static java.lang.System.arraycopy;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/13 20:23
 */
public class TeamService
{
    public static final int MAX_PROGRAMMER = 3;
    public static final int MAX_DESIGNER = 2;
    public static final int MAX_ARCHITECT = 1;
    private static final int MAX = 5; // �������
    private static int counter = 1; // memberID
    private Programmer[] team = new Programmer[MAX];
    private int total = 0; // ʵ������

    public TeamService()
    { }

    // �м����˷��ؼ���, ��Ȼ���ܻ��ָ��
    public Programmer[] getTeam()
    {
        Programmer[] _team = new Programmer[total];
        arraycopy(team, 0, _team, 0, total);
        return _team;
    }

    public void addMember(Employee e) throws TeamException
    {
        if (total >= MAX)
            throw new TeamException("��Ա����(5��)");
        if (!(e instanceof Programmer))
            throw new TeamException("���ǿ�����Ա");
        if (isExist(e))
            throw new TeamException("�Ѿ��ڿ����Ŷ���");
        Programmer p = (Programmer) e;
        if (!Status.FREE.equals(p.getStatus()))
            throw new TeamException("��Ա�������ڿ���״̬");
        int cntArc = 0, cntDes = 0, cntPro = 0;
        for (int i = 0; i < total; i++)
        {
            if (team[i] instanceof Architect)
                ++cntArc;
            else if (team[i] instanceof Designer)
                ++cntDes;
            else
                ++cntPro;
        }
        if (p instanceof Architect)
        {
            if (cntArc >= MAX_ARCHITECT)
                throw new TeamException("������1���ܹ�ʦ");
        }
        else if (p instanceof Designer)
        {
            if (cntDes >= MAX_DESIGNER)
                throw new TeamException("������2�����ʦ");
        }
        else
        {
            if (cntPro >= MAX_PROGRAMMER)
                throw new TeamException("������3������Գ");
        }
        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberID(counter++);
    }

    private boolean isExist(Employee e)
    {
        for (int i = 0; i < total; i++)
            return team[i].getId() == e.getId();
        return false;
    }

    public void removeMember(int memberID) throws TeamException
    {
        // 1. �޸�״̬
        int index = 0;
        for (; index < total; ++index)
        {
            if (team[index].getMemberID() == memberID)
            {
                team[index].setStatus(Status.FREE);
                break;
            }
        }
        if (index == total)
            throw new TeamException("�Ҳ���ָ��memberID��Ա��");
        // 2. �ú�������
        for (int i = index + 1; i < total; ++i)
            team[i - 1] = team[i];
        team[--total] = null;
    }
}


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
    private static final int MAX = 5; // 最大人数
    private static int counter = 1; // memberID
    private Programmer[] team = new Programmer[MAX];
    private int total = 0; // 实际人数

    public TeamService()
    { }

    // 有几个人返回几个, 不然可能会空指针
    public Programmer[] getTeam()
    {
        Programmer[] _team = new Programmer[total];
        arraycopy(team, 0, _team, 0, total);
        return _team;
    }

    public void addMember(Employee e) throws TeamException
    {
        if (total >= MAX)
            throw new TeamException("成员已满(5人)");
        if (!(e instanceof Programmer))
            throw new TeamException("不是开发人员");
        if (isExist(e))
            throw new TeamException("已经在开发团队中");
        Programmer p = (Programmer) e;
        if (!Status.FREE.equals(p.getStatus()))
            throw new TeamException("该员工不处于空闲状态");
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
                throw new TeamException("最多添加1名架构师");
        }
        else if (p instanceof Designer)
        {
            if (cntDes >= MAX_DESIGNER)
                throw new TeamException("最多添加2名设计师");
        }
        else
        {
            if (cntPro >= MAX_PROGRAMMER)
                throw new TeamException("最多添加3名程序猿");
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
        // 1. 修改状态
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
            throw new TeamException("找不到指定memberID的员工");
        // 2. 用后面的填坑
        for (int i = index + 1; i < total; ++i)
            team[i - 1] = team[i];
        team[--total] = null;
    }
}


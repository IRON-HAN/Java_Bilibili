package Project.view;

import Project.domain.*;
import Project.service.*;

import static Project.view.TSUtility.*;
/**
 * @description:
 * @author: Pcy
 * @date: 20/8/14 9:15
 */
public class TeamView
{
    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();

    public TeamView()
    { }

    public static void main(String[] args)
    {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }

    public void enterMainMenu()
    {
        boolean flag = true;
        while (flag)
        {
            listAllEmployees();
            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            char menu = readMenuSelection();
            switch (menu)
            {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("是否退出Y/N");
                    char confirm = readConfirmSelection();
                    if (confirm == 'Y')
                        flag = false;
                    break;
            }
        }
    }

    public void listAllEmployees()
    {
        System.out.println(
                "-------------------------------开发团队调度软件--------------------------------\n");
        Employee[] employees = nameListService.getAllEmployees();
        if (employees == null || employees.length == 0)
        {
            System.out.println("公司中没有任何员工信息！");
        }
        else
        {
            System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for (int i = 0; i < employees.length; i++)
            {
                System.out.println(employees[i]);
            }
        }
        System.out.println(
                "-------------------------------------------------------------------------------");
    }

    public void getTeam()
    {
        System.out.println("--------------------团队成员列表---------------------\n");
        Programmer[] team = teamService.getTeam();
        if (team == null || team.length == 0)
        {
            System.out.println("开发团队目前没有成员！");
        }
        else
        {
            System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0; i < team.length; i++)
            {
                System.out.println(team[i]);
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    public void addMember()
    {
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = readInt();
        try
        {
            Employee employee = nameListService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");
        } catch (TeamException e)
        {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        // 按回车继续
        readReturn();
    }

    public void deleteMember()
    {
        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TID：");
        int memberID = readInt();
        System.out.print("确认是否删除(Y/N)：");
        char confirm = readConfirmSelection();
        if (confirm == 'N')
            return;
        try
        {
            teamService.removeMember(memberID);
            System.out.println("删除成功");
        } catch (TeamException e)
        {
            System.out.println("删除失败，原因：" + e.getMessage());
        }
        readReturn();
    }
}


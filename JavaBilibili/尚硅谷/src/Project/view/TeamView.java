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
            System.out.print("1-�Ŷ��б�  2-����Ŷӳ�Ա  3-ɾ���Ŷӳ�Ա 4-�˳�   ��ѡ��(1-4)��");
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
                    System.out.println("�Ƿ��˳�Y/N");
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
                "-------------------------------�����Ŷӵ������--------------------------------\n");
        Employee[] employees = nameListService.getAllEmployees();
        if (employees == null || employees.length == 0)
        {
            System.out.println("��˾��û���κ�Ա����Ϣ��");
        }
        else
        {
            System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
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
        System.out.println("--------------------�Ŷӳ�Ա�б�---------------------\n");
        Programmer[] team = teamService.getTeam();
        if (team == null || team.length == 0)
        {
            System.out.println("�����Ŷ�Ŀǰû�г�Ա��");
        }
        else
        {
            System.out.println("TID/ID\t����\t����\t����\tְλ\t����\t��Ʊ\n");
            for (int i = 0; i < team.length; i++)
            {
                System.out.println(team[i]);
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    public void addMember()
    {
        System.out.println("---------------------��ӳ�Ա---------------------");
        System.out.print("������Ҫ��ӵ�Ա��ID��");
        int id = readInt();
        try
        {
            Employee employee = nameListService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("��ӳɹ�");
        } catch (TeamException e)
        {
            System.out.println("���ʧ�ܣ�ԭ��" + e.getMessage());
        }
        // ���س�����
        readReturn();
    }

    public void deleteMember()
    {
        System.out.println("---------------------ɾ����Ա---------------------");
        System.out.print("������Ҫɾ��Ա����TID��");
        int memberID = readInt();
        System.out.print("ȷ���Ƿ�ɾ��(Y/N)��");
        char confirm = readConfirmSelection();
        if (confirm == 'N')
            return;
        try
        {
            teamService.removeMember(memberID);
            System.out.println("ɾ���ɹ�");
        } catch (TeamException e)
        {
            System.out.println("ɾ��ʧ�ܣ�ԭ��" + e.getMessage());
        }
        readReturn();
    }
}


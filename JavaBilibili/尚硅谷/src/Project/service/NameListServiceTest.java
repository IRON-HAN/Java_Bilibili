package Project.service;

import Project.domain.Employee;
import org.junit.Test;
public class NameListServiceTest
{
    NameListService service = new NameListService();

    @Test
    public void getAllEmployees()
    {
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++)
        {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void getEmployee()
    {
        int id = 100;
        try
        {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e)
        {
            e.printStackTrace();
        }
    }
}
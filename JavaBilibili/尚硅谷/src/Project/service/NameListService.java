package Project.service;

import Project.domain.PC;
import Project.domain.*;

import static Project.service.Data.*;

public class NameListService
{
    private Employee[] employees;

    public NameListService()
    {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++)
        {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            // 声明而不赋值, 如果有这个属性才会去获取, 防止发生异常
            Equipment equipment;
            double bonus;
            int stock;
            switch (type)
            {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = getEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = getEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = getEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    private Equipment getEquipment(int index)
    {
        int key = Integer.parseInt(EQIPMENTS[index][0]);
        String model = EQIPMENTS[index][1];
        switch (key)
        {
            case PC:
                String display = EQIPMENTS[index][2];
                return new PC(model, display);
            case NOTEBOOK:
                double price = Double.parseDouble(EQIPMENTS[index][2]);
                return new NoteBook(model, price);
            case PRINTER:
                String type = EQIPMENTS[index][2];
                return new Printer(model, type);
        }
        return null;
    }

    public Employee[] getAllEmployees()
    {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException
    {
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].getId() == id)
                return employees[i];
        }
        throw new TeamException("找不到指定id的员工!");
    }
}


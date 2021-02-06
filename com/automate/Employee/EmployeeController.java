package com.automate.Employee;

import java.util.List;

public class EmployeeController {
    EmployeeService empservice = new EmployeeService();

   // public void createEmp(String name, int i, int age, int id, int salary)

    public void displayAll() {
        empservice.listAllEmployees();
    }
    public void deleteEmployee(int empid) {
        empservice.deleteEmployee(empid);
    }
    public void updateEmployee(int empId,String name) {
        empservice.updateEmployee(empId,name);
    }
    public void sortByAge() {
        List<EmployeeModal> emplist= empservice.sortByAge();
        for(EmployeeModal e:emplist)
            System.out.println(e);
    }

    public void sortByName() {
        List<EmployeeModal> employeeModalList = empservice.sortByName();
        for (EmployeeModal e:employeeModalList)
            System.out.println(e);
    }


    public void createEmp(String name, int id, int age, int salary)
        {
            empservice.createEmployee(name,age,id,salary);
        }

}
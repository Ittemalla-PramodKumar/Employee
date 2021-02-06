package com.automate.Employee;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        int i= 0;
        while(i<3) {
            System.out.println("Enter employee name: ");
            String name = scanner.next();
            System.out.println("Enter employee age : ");
            int age = scanner.nextInt();
            System.out.println("Enter Employee salary: ");
            int salary = scanner.nextInt();
            System.out.println("Enter Employee Id: ");
            int id = scanner.nextInt();
            employeeController.createEmp(name,id,age,salary);
             i++;
        }
        System.out.println("Employees");
        employeeController.displayAll();

        System.out.println("enter empId to delete");
        int empId=scanner.nextInt();
        employeeController.deleteEmployee(empId);

        System.out.println("After Sorting by Age");
        employeeController.sortByAge();
        System.out.println("After Sorting by Name");
       employeeController.sortByName();

    }
}

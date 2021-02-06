package com.automate.Employee;

public class EmployeeModal {
    String ename;
    int empid;
    int age;
    int salary;

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "EmployeeModal{" +
                "ename='" + ename + '\'' +
                ", age=" + age +
                ", empid=" + empid +
                ", salary=" + salary +
                '}';
    }
}
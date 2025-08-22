package com.cg.eis.service;

import java.util.Scanner;
import com.cg.eis.bean.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	Scanner sc = new Scanner(System.in);

    @Override
    public void getEmployeeDetails() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        Employee emp = new Employee(id, name, salary, designation);
        emp.setInsuranceScheme(findInsuranceScheme(emp));
        displayEmployeeDetails(emp);
    }

    @Override
    public String findInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation().toLowerCase();

        if (salary < 20000 && designation.equals("clerk")) {
            return "No Scheme";
        } else if (salary >= 20000 && salary < 40000 && designation.equals("programmer")) {
            return "Scheme C";
        } else if (salary >= 40000 && salary < 60000 && designation.equals("manager")) {
            return "Scheme B";
        } else if (salary >= 60000) {
            return "Scheme A";
        } else {
            return "No Scheme";
        }        
        }
    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println("\n--- Employee Details ---");
        System.out.println(emp);
    }

}

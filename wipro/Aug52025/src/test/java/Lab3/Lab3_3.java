package Lab3;

import java.util.Scanner;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

public class Lab3_3 {
    int id;
    String name;
    double salary;
    String designation;
    String insuranceScheme;

    public Lab3_3(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = findInsuranceScheme();
    }

    public String findInsuranceScheme() {
        if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        }
        return "Not Applicable";
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("Insurance Scheme: " + insuranceScheme);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            if (salary < 3000) {
                throw new EmployeeException("Salary is below 3000. Not allowed.");
            }

            System.out.print("Enter Designation: ");
            String designation = sc.next();

            Lab3_3 emp = new Lab3_3(id, name, salary, designation);
            emp.displayDetails();

        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! " + e);
        } finally {
            sc.close();
        }
    }
}

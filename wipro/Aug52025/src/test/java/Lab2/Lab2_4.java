package Lab2;

import java.util.Scanner;

class Lab2_4Person {
    private String name;
    private float age;

    public Lab2_4Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

abstract class Lab2_4Account {
    private long accNum;
    protected double balance;
    private Lab2_4Person accHolder;

    public Lab2_4Account(long accNum, double balance, Lab2_4Person accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accNum + ", Balance: " + balance + ", Holder: " + accHolder;
    }
}

class Lab2_4SavingsAccount extends Lab2_4Account {
    private static final double MIN_BALANCE = 500;

    public Lab2_4SavingsAccount(long accNum, double balance, Lab2_4Person accHolder) {
        super(accNum, balance, accHolder);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful from Savings Account.");
        } else {
            System.out.println("Withdrawal denied! Minimum balance of INR " + MIN_BALANCE + " must be maintained.");
        }
    }
}

class Lab2_4CurrentAccount extends Lab2_4Account {
    private double overdraftLimit;

    public Lab2_4CurrentAccount(long accNum, double balance, Lab2_4Person accHolder, double overdraftLimit) {
        super(accNum, balance, accHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful from Current Account.");
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setDesignation(String designation) { this.designation = designation; }
    public void setInsuranceScheme(String insuranceScheme) { this.insuranceScheme = insuranceScheme; }
    public double getSalary() { return salary; }
    public String getDesignation() { return designation; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary +
               ", Designation: " + designation + ", Insurance Scheme: " + insuranceScheme;
    }
}

interface EmployeeService {
    void getEmployeeDetails(Employee emp);
    String findInsuranceScheme(Employee emp);
    void displayEmployeeDetails(Employee emp);
}

class EmployeeServiceImpl implements EmployeeService {
    private Scanner sc = new Scanner(System.in);

    @Override
    public void getEmployeeDetails(Employee emp) {
        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        emp.setName(sc.nextLine());
        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter Designation: ");
        emp.setDesignation(sc.nextLine());
    }

    @Override
    public String findInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        String scheme;
        if (salary >= 50000 && designation.equalsIgnoreCase("Manager")) {
            scheme = "Platinum";
        } else if (salary >= 30000 && designation.equalsIgnoreCase("Programmer")) {
            scheme = "Gold";
        } else if (salary >= 20000 && designation.equalsIgnoreCase("Clerk")) {
            scheme = "Silver";
        } else {
            scheme = "No Scheme";
        }
        emp.setInsuranceScheme(scheme);
        return scheme;
    }

    @Override
    public void displayEmployeeDetails(Employee emp) {
        System.out.println(emp);
    }
}

public class Lab2_4 {
    public static void main(String[] args) {
        // Part 1 — Account operations
        Lab2_4Person smith = new Lab2_4Person("Smith", 30);
        Lab2_4Person kathy = new Lab2_4Person("Kathy", 25);

        Lab2_4Account smithAcc = new Lab2_4SavingsAccount(1001, 2000, smith);
        Lab2_4Account kathyAcc = new Lab2_4CurrentAccount(1002, 3000, kathy, 1000);

        smithAcc.deposit(2000);
        smithAcc.withdraw(2000);
        kathyAcc.withdraw(3500);

        System.out.println(smithAcc);
        System.out.println(kathyAcc);

        // Part 2 — Employee Insurance System
        Employee emp = new Employee();
        EmployeeService service = new EmployeeServiceImpl();

        service.getEmployeeDetails(emp);
        service.findInsuranceScheme(emp);
        service.displayEmployeeDetails(emp);
    }
}

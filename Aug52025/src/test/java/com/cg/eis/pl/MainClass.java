package com.cg.eis.pl;


import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class MainClass {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeServiceImpl();
        service.getEmployeeDetails();
    }

}

package com.bridgelabz.empwagecomputation;

public class EmpWageBuilder {
    public static void main(String[] args) {
        Object[] employeeWageComputation = new Object[10];
        int index = 0;
        System.out.println("Welcome to Employee Wage Computation");
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage("Reliance", 20, 20, 50);
        employeeWageComputation[index++] = companyEmployeeWage.get_EmployeeWageForCompany();

        companyEmployeeWage = new CompanyEmployeeWage("D-mart", 10, 25, 50);
        employeeWageComputation[index++] = companyEmployeeWage.get_EmployeeWageForCompany();

        companyEmployeeWage = new CompanyEmployeeWage("metro", 17, 25, 20);
        employeeWageComputation[index++] = companyEmployeeWage.get_EmployeeWageForCompany();

        for (int index1 = 0; index1 < index; index1++) {
            System.out.println("Total-wage of " + employeeWageComputation[index1]);
        }
    }
}
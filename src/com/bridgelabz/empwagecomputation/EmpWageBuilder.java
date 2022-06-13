package com.bridgelabz.empwagecomputation;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpWageBuilder {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        int index = 0;
        System.out.println("Welcome to Employee Wage Computation");
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage("Reliance", 20, 20, 50);
        arrayList.add(companyEmployeeWage.get_EmployeeWageForCompany());

        companyEmployeeWage = new CompanyEmployeeWage("D-mart", 10, 25, 50);
        arrayList.add(companyEmployeeWage.get_EmployeeWageForCompany());

        companyEmployeeWage = new CompanyEmployeeWage("metro", 17, 25, 20);
        arrayList.add(companyEmployeeWage.get_EmployeeWageForCompany());

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.println("Employee Wage of Company " + string);
        }
    }
}
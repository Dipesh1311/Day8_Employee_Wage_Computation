package com.bridgelabz.empwagecomputation;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpWageBuilder {
    static ArrayList arrayList = new ArrayList();

    public static void printWage() {
        Iterator iterator = arrayList.iterator();
        int day = 1;
        int length = arrayList.size();
        while (iterator.hasNext()) {
            Integer string = (Integer) iterator.next();
            if (day == length)
                System.out.println("Total Wage of Company:" + string);
            else
                System.out.println("day " + day + ":" + string);
            day++;
        }
        System.out.println(arrayList);
    }

    public static void main(String[] args) {

        int index = 0;
        System.out.println("Welcome to Employee Wage Computation");
        CompanyEmployeeWage companyEmployeeWage = new CompanyEmployeeWage("Reliance", 20, 20, 50);
        arrayList = companyEmployeeWage.get_EmployeeWageForCompany();
        printWage();

        companyEmployeeWage = new CompanyEmployeeWage("D-mart", 10, 25, 50);
        arrayList = companyEmployeeWage.get_EmployeeWageForCompany();
        printWage();

        companyEmployeeWage = new CompanyEmployeeWage("metro", 17, 25, 20);
        arrayList = companyEmployeeWage.get_EmployeeWageForCompany();
        printWage();

    }
}
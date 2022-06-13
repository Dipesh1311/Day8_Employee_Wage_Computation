package com.bridgelabz.empwagecomputation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmpWageBuilder {
    private static int wagePerHour;
    static ArrayList arrayList = new ArrayList();
    private static String companyName;
    private static int workingDays;
    private static int maxHours;

    public static void inputDataOfDifferntCompanies() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the company name");
        companyName = scanner.nextLine();
        System.out.println("Enter the wage per hour");
        wagePerHour = scanner.nextInt();
        System.out.println("Enter the number of working days in a month");
        workingDays = scanner.nextInt();
        System.out.println("Enter the number of working hours per month");
        maxHours = scanner.nextInt();
        CompanyEmployeeWage companyEmployeeWage;
        companyEmployeeWage = new CompanyEmployeeWage(companyName, wagePerHour, workingDays, maxHours);
        arrayList.addAll(companyEmployeeWage.get_EmployeeWageForCompany());
        printTotalWage();
    }

    public static void printTotalWage() {
        Iterator iterator = arrayList.iterator();
        int day = 1;
        int length = arrayList.size();
        int totalWage = 0;
        System.out.println("Daily Wage of Company " + companyName + " :");
        while (iterator.hasNext()) {
            Integer string = (Integer) iterator.next();
            totalWage += string;
            System.out.println("day " + day + ":" + string);
            day++;
        }
        System.out.println("Total Wage of company " + companyName + " " + totalWage);
    }

    public static void main(String[] args) {
        int index = 0;
        System.out.println("Welcome to Employee Wage Computation");
        int Number_of_companies;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of companies");
        Number_of_companies = scanner.nextInt();
        for (int i = 0; i < Number_of_companies; i++) {
            inputDataOfDifferntCompanies();
        }
    }
}
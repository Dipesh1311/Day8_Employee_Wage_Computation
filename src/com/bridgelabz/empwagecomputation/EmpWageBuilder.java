package com.bridgelabz.empwagecomputation;

public class EmpWageBuilder {
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 0;

    public static void get_EmployeeWageForCompany(String company, int wagePerHour, int workingDaysPerMonth,
                                                  int maxHours) {
        int totalWage = 0;
        int dailyWage = 0;
        int totalDays = 0;
        int totalHours = 0;
        int workingHours = 0;

        while (totalDays <= workingDaysPerMonth && totalHours < maxHours) {
            totalDays++;
            int checkWorking = (int) (Math.random() * 3);
            switch (checkWorking) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
            }
            dailyWage = (wagePerHour * workingHours);
            System.out.println("Day " + totalDays + " Employee Wage for Company " + company + " is " + dailyWage);
            totalWage += dailyWage;
        }
        System.out.println("Total Employee Wage for " + company + " is " + totalWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        get_EmployeeWageForCompany("Reliance", 20, 20, 50);
    }
}

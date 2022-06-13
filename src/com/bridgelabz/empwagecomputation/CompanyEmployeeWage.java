package com.bridgelabz.empwagecomputation;

public class CompanyEmployeeWage {
    private static final int FULL_TIME = 1;
    private static final int PART_TIME = 0;

    private final String companyName;
    private final int wagePerHour;
    private final int workingDaysPerMonth;
    private final int maxHours;

    public CompanyEmployeeWage(String companyName, int wagePerHour, int workingDaysPerMonth, int maxHours) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.maxHours = maxHours;
    }

    public String get_EmployeeWageForCompany() {
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
            totalWage += dailyWage;
        }
        return companyName+" "+totalWage;
    }
}

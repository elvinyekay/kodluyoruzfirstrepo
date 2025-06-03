package entity;

public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;
    private double bonus;
    public final int currentYear = 2021;

    public Employee(String name, int salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary <= 1000) return 0;
        return this.salary * 0.03;
    }

    public double bonus() {
        double extraHours;
        // haftada 40 saat, aylik 160 saat hesabi ile hesabladim
        if (this.workHours > 160) {
            extraHours = workHours - (40 * 4);
            this.bonus = extraHours * 30;
        }
        return this.bonus;
    }

    public double raiseSalary() {
        double raiseSalaryAmount;
        int workYear = this.currentYear - this.hireYear;
        if (workYear < 10) {
            raiseSalaryAmount = this.salary * 0.05;
        } else if (workYear < 20) {
            raiseSalaryAmount = this.salary * 0.10;
        } else {
            raiseSalaryAmount = this.salary * 0.15;
        }

        return raiseSalaryAmount;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();
        double finalSalary = this.salary - tax + bonus + raiseSalary;
        return "Name: " + this.name
                + "\nSalary: " + this.salary
                + "\nWork Hours: " + this.workHours
                + "\nHire Year: " + this.hireYear
                + "\nTax: " + tax
                + "\nBonus: " + bonus
                + "\nRaise Salary: " + raiseSalary
                + "\nFinal Salary: " + finalSalary;
    }
}

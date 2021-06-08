package CinemaEmployee;

public class TicketSeller extends BaseEmployee{
    public int calculateMonthlySalary(int monthlySalary) {
        monthlySalary = baseSalary + Manager.salaryBonus;
        return monthlySalary;
    }
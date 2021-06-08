package CinemaEmployee;

public class Manager extends BaseEmployee{
    int baseSalary = baseSalary + 5000;
   protected static int salaryBonus = 500;

    public int calculateMonthlySalary(int monthlySalary){
        monthlySalary = baseSalary + salaryBonus;
        return monthlySalary;
}

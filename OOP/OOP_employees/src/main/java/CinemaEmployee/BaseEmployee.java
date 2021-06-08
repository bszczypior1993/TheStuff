package CinemaEmployee;

public class BaseEmployee {
    String name;
    String surname;
    protected int baseSalary = 3000;
   final int yearOfHiring;
    int monthlySalary;
    int yearsOfEmployment = 2021-yearOfHiring;


    public BaseEmployee(String name, String surname, int baseSalary, int yearOfHiring) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfHiring = yearOfHiring;
    }

    public int calculateMonthlySalary(int monthlySalary){
        monthlySalary = baseSalary + Manager.salaryBonus;
        return monthlySalary;
    }
}


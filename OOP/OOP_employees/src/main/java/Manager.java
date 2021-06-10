public class Manager extends BaseEmployee {

    public Manager(String name, String surname, int baseSalary, int extraManagerSalary, int yearOfHiring, int salaryBonus) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.extraManagerSalary = extraManagerSalary;
        this.yearOfHiring = yearOfHiring;
        this.salaryBonus = salaryBonus;
    }
    protected static int salaryBonus = 500;
    private static int extraManagerSalary = 2000;

@Override
    public int calculateMonthlySalary() {
        int monthlySalary = baseSalary + extraManagerSalary + salaryBonus;
        return monthlySalary;
    }
}

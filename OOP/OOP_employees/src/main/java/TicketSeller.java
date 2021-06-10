public class TicketSeller extends BaseEmployee {


    public TicketSeller(String name, String surname, int baseSalary, int yearOfHiring) {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfHiring = yearOfHiring;
    }

    @Override
    public int calculateMonthlySalary() {
        int monthlySalary = baseSalary;
        return monthlySalary;
    }
}

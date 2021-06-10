public abstract class BaseEmployee {

    public static void main(String[] args){

    }

    protected String name;
    protected String surname;
    public static int baseSalary = 3000;
    protected int yearOfHiring;
    private static final int currentYear = 2021;


    public abstract int calculateMonthlySalary();
    public int calculateYearsOfEmployment(){
        int yearsOfEmployment = currentYear - yearOfHiring;
        return yearsOfEmployment;
    }
}

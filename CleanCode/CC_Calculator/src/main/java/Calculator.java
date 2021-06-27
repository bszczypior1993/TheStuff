public abstract class Calculator {

    public static void main (String[] args){
        Addition addition = new Addition (3.14,5.66);
        Deduction deduction = new Deduction(45.66,23.44);
        Multiplication multiplication = new Multiplication(4.567,3.42);
        Division division = new Division(3.87,12.768);


        System.out.println(addition.calculation());
        System.out.println(deduction.calculation());
        System.out.println(multiplication.calculation());
        System.out.println(division.calculation());
    }

    public abstract double calculation ();

}
